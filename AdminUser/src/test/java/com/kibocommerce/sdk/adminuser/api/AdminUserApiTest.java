/*
 * Kibo Admin User Service
 * OpenAPI Spec for Kibo Admin User Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.adminuser.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.adminuser.models.AdminUserPasswordInfo;
import com.kibocommerce.sdk.adminuser.models.AdminUserResetPasswordInfo;
import com.kibocommerce.sdk.adminuser.models.AdminUserUserRoleCollection;
import com.kibocommerce.sdk.adminuser.models.ChangeUserPasswordInfo;
import com.kibocommerce.sdk.adminuser.models.TenantCollection;
import com.kibocommerce.sdk.adminuser.models.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminUserApi
 */
@Disabled
public class AdminUserApiTest {

    private final AdminUserApi api = new AdminUserApi();

    /**
     * Add User Role
     *
     * Adds a role to the specified user&#39;s Admin account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addUserRoleTest() throws ApiException {
        String userId = null;
        Integer roleId = null;
        api.addUserRole(userId, roleId);
        // TODO: test validations
    }

    /**
     * Changes a user&#39;s password
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changePasswordTest() throws ApiException {
        String userId = null;
        AdminUserPasswordInfo adminUserPasswordInfo = null;
        api.changePassword(userId, adminUserPasswordInfo);
        // TODO: test validations
    }

    /**
     * Change User Password
     *
     * Changes a user&#39;s password to the provided new password
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changeUserPasswordTest() throws ApiException {
        String userId = null;
        ChangeUserPasswordInfo changeUserPasswordInfo = null;
        api.changeUserPassword(userId, changeUserPasswordInfo);
        // TODO: test validations
    }

    /**
     * Creates a new user
     *
     * Creates a new user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        User user = null;
        User response = api.createUser(user);
        // TODO: test validations
    }

    /**
     * Delete User
     *
     * Removes a user account from the site.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String userId = null;
        api.deleteUser(userId);
        // TODO: test validations
    }

    /**
     * Get tenant scope for users
     *
     * Get tenant scope for users
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTenantScopesForUserTest() throws ApiException {
        String userId = null;
        TenantCollection response = api.getTenantScopesForUser(userId);
        // TODO: test validations
    }

    /**
     * Get User
     *
     * Retrieves the details of a user specified by user ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String userId = null;
        User response = api.getUser(userId);
        // TODO: test validations
    }

    /**
     * Get User By Id
     *
     * Retrieves the details of a user specified by user ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserByIdTest() throws ApiException {
        String userId = null;
        String responseGroups = null;
        User response = api.getUserById(userId, responseGroups);
        // TODO: test validations
    }

    /**
     * Get User Roles
     *
     * Retrieves all the roles for a specified user on the specified tenant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserRolesTest() throws ApiException {
        String userId = null;
        AdminUserUserRoleCollection response = api.getUserRoles(userId);
        // TODO: test validations
    }

    /**
     * Get Users
     *
     * Retrieves a list of Admin users for a specified site according to any specified filter criteria and sort options.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        String emailAddress = null;
        Integer startIndex = null;
        Integer pageSize = null;
        String sortBy = null;
        String filter = null;
        String responseGroups = null;
        api.getUsers(emailAddress, startIndex, pageSize, sortBy, filter, responseGroups);
        // TODO: test validations
    }

    /**
     * Remove User Role
     *
     * Removes a role from the specified Admin account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeUserRoleTest() throws ApiException {
        String userId = null;
        Integer roleId = null;
        api.removeUserRole(userId, roleId);
        // TODO: test validations
    }

    /**
     * Reset Password
     *
     * Resets the password for a user specified by email address.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetPasswordTest() throws ApiException {
        AdminUserResetPasswordInfo adminUserResetPasswordInfo = null;
        api.resetPassword(adminUserResetPasswordInfo);
        // TODO: test validations
    }

    /**
     * Enables the user
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unlockUserTest() throws ApiException {
        String userId = null;
        api.unlockUser(userId);
        // TODO: test validations
    }

    /**
     * Update User
     *
     * Modifies user information for a specified user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String userId = null;
        User user = null;
        User response = api.updateUser(userId, user);
        // TODO: test validations
    }

}
