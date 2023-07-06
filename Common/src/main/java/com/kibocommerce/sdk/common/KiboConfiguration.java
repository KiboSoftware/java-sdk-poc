package com.kibocommerce.sdk.common;

import com.kibocommerce.sdk.common.ApiClientBuilder;
import com.kibocommerce.sdk.common.ApiCredentials;
import com.kibocommerce.sdk.common.ApiClient;
import com.kibocommerce.sdk.common.KiboHeaders;
import com.kibocommerce.sdk.common.constants.EnvironmentVars;
import com.kibocommerce.sdk.common.constants.Templates;
import java.util.Map;
import java.util.HashMap;
import java.net.URI;

public class KiboConfiguration {

    private Integer tenantId;
    private Integer siteId;
    private Integer masterCatalogId;
    private Integer catalogId;
    private String locale;
    private String currency;
    private String apiEnv;
    private String apiRegion;
    private String authHost;
    private String pciHost;
    private String tenantHost;
    private ApiCredentials credentials;
    private ApiClient apiClient;

    private KiboConfiguration(Builder builder) {
        this.tenantId = builder.tenantId;
        this.siteId = builder.siteId;
        this.masterCatalogId = builder.masterCatalogId;
        this.catalogId = builder.catalogId;
        this.locale = builder.locale;
        this.currency = builder.currency;
        this.credentials = builder.credentials;
        this.apiEnv = builder.apiEnv;
        this.apiRegion = builder.apiRegion;
        this.authHost = builder.authHost;
        this.pciHost = builder.pciHost;
        this.tenantHost = builder.tenantHost;
        this.apiClient = builder.apiClient;
    }

    public Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<String, String>();
        if (this.locale != null) {
            headers.put(KiboHeaders.X_VOL_LOCALE, this.locale);
        }
        if (this.currency != null) {
            headers.put(KiboHeaders.X_VOL_CURRENCY, this.currency);
        }
        if (this.masterCatalogId != null) {
            headers.put(KiboHeaders.X_VOL_MASTER_CATALOG, this.masterCatalogId.toString());
        }
        if (this.catalogId != null) {
            headers.put(KiboHeaders.X_VOL_CATALOG, this.catalogId.toString());
        }
        if (this.tenantId != null) {
            headers.put(KiboHeaders.X_VOL_TENANT, this.tenantId.toString());
        }
        if (this.siteId != null) {
            headers.put(KiboHeaders.X_VOL_SITE, this.siteId.toString());
        }
        return headers;
    }

    public String getServerForTemplate(String template) {
        if (template == null) {
            return null;
        }
        if (template.contains(Templates.HOME_POD_PLACEHOLDER)) {
            return template.replace(Templates.HOME_POD_PLACEHOLDER, this.authHost);
        }
        if (template.contains(Templates.PCI_POD_PLACEHOLDER)) {
            return template.replace(Templates.PCI_POD_PLACEHOLDER, this.pciHost);
        }
        if (template.contains(Templates.TENANT_POD_PLACEHOLDER)) {
            return template.replace(Templates.TENANT_POD_PLACEHOLDER, this.tenantHost);
        }
        return null;
    }

    public static class Builder {
        private Integer tenantId = 0;
        private Integer siteId = 0;
        private Integer masterCatalogId = null;
        private Integer catalogId = null;
        private String locale = null;
        private String currency = null;
        private String apiEnv = null;
        private String apiRegion = null;
        private String authHost = "home.mozu.com";
        private String pciHost = null;
        private String tenantHost = null;
        private ApiClient apiClient = null;
        private ApiCredentials credentials = null;
        private ApiClientBuilder clientBuilder = null;
        private boolean useSSL = true;
        private boolean debugClient = false;

        public Builder() {
            clientBuilder = ApiClientBuilder.builder();
        }

        public Builder withTenantId(Integer tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder withSiteId(Integer siteId) {
            this.siteId = siteId;
            return this;
        }

        public Builder withMasterCatalogId(Integer masterCatalogId) {
            this.masterCatalogId = masterCatalogId;
            return this;
        }

        public Builder withCatalogId(Integer catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }

        public Builder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder withApiEnv(String apiEnv) {
            this.apiEnv = apiEnv;
            return this;
        }

        public Builder withApiRegion(String apiRegion) {
            this.apiRegion = apiRegion;
            return this;
        }

        public Builder withHomeHost(String authHost) {
            this.authHost = authHost;
            return this;
        }

        public Builder withPciHost(String pciHost) {
            this.pciHost = pciHost;
            return this;
        }

        public Builder withCredentials(ApiCredentials credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder withTenantHost(String tenantHost) {
            this.tenantHost = tenantHost;
            return this;
        }

        public Builder withSsl(boolean useSSL) {
            this.useSSL = useSSL;
            return this;
        }
        public Builder withDebugClient(boolean debugClient) {
            this.debugClient = debugClient;
            return this;
        }
        public Builder fromEnvironmentVariables() {

            this.tenantId = Integer.parseInt(System.getenv(EnvironmentVars.KIBO_TENANT));
            this.siteId = Integer.parseInt(System.getenv(EnvironmentVars.KIBO_SITE));
            this.masterCatalogId = Integer.parseInt(System.getenv(EnvironmentVars.KIBO_MASTER_CATALOG));
            this.catalogId = Integer.parseInt(System.getenv(EnvironmentVars.KIBO_CATALOG));
            this.locale = System.getenv(EnvironmentVars.KIBO_LOCALE);
            this.currency = System.getenv(EnvironmentVars.KIBO_CURRENCY);

            this.apiEnv = System.getenv(EnvironmentVars.KIBO_API_ENV);
            this.apiRegion = System.getenv(EnvironmentVars.KIBO_API_REGION);
            this.pciHost = System.getenv(EnvironmentVars.KIBO_PCI_HOST);

            String clientId = System.getenv(EnvironmentVars.KIBO_CLIENT_ID);
            String sharedSecret = System.getenv(EnvironmentVars.KIBO_CLIENT_SECRET);
            if (clientId != null && !clientId.isEmpty() && sharedSecret != null && !sharedSecret.isEmpty()) {
                this.credentials = ApiCredentials.builder()
                        .setClientId(clientId)
                        .setClientSecret(sharedSecret)
                        .build();
            }
            String debugClient = System.getenv(EnvironmentVars.KIBO_DEBUG_CLIENT);
            if(debugClient != null){
                this.debugClient = Boolean.parseBoolean(debugClient);
            }
            String authHost = System.getenv(EnvironmentVars.KIBO_AUTH_HOST);
            String homeHost = System.getenv(EnvironmentVars.KIBO_HOME_HOST);
            if (authHost != null && !authHost.isEmpty())
                this.authHost = authHost;
            else if (homeHost != null && !homeHost.isEmpty())
                this.authHost = homeHost;

            // Load other properties from environment variables
            return this;
        }

        public ApiClient buildClient() {
            String homePodUrl = this.authHost;
            if (!URI.create(homePodUrl).isAbsolute()) {
                homePodUrl = (useSSL ? "https" : "http") + "://" + homePodUrl;
            }
            return clientBuilder.withCredentials(this.credentials)
                    .withHomePodBaseUrl(homePodUrl)
                    .build();
        }

        public KiboConfiguration build() {
            this.apiClient = this.buildClient();
            return new KiboConfiguration(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public ApiClient getClient() {
        return apiClient;
    }
}