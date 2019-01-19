package com.byteowls.capacitor.oauth2;

/**
 * @author m.oberwasserlechner@byteowls.com
 */
public class OAuth2Options {

    private String appId;
    private String authorizationBaseUrl;
    private String accessTokenEndpoint;
    private String resourceUrl;
    private String responseType;
    private String scope;
    private String state;
    private boolean stateDisabled;
    private boolean authorizationCodeOnly;
    private String redirectUrl;
    private String customHandlerClass;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAuthorizationBaseUrl() {
        return authorizationBaseUrl;
    }

    public void setAuthorizationBaseUrl(String authorizationBaseUrl) {
        this.authorizationBaseUrl = authorizationBaseUrl;
    }

    public String getAccessTokenEndpoint() {
        return accessTokenEndpoint;
    }

    public void setAccessTokenEndpoint(String accessTokenEndpoint) {
        this.accessTokenEndpoint = accessTokenEndpoint;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isStateDisabled() {
        return stateDisabled;
    }

    public void setStateDisabled(boolean stateDisabled) {
        this.stateDisabled = stateDisabled;
    }

    public boolean isAuthorizationCodeOnly() {
        return authorizationCodeOnly;
    }

    public void setAuthorizationCodeOnly(boolean authorizationCodeOnly) {
        this.authorizationCodeOnly = authorizationCodeOnly;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getCustomHandlerClass() {
        return customHandlerClass;
    }

    public void setCustomHandlerClass(String customHandlerClass) {
        this.customHandlerClass = customHandlerClass;
    }
}