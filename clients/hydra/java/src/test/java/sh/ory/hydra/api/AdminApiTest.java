/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.9.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.hydra.api;

import sh.ory.hydra.ApiException;
import sh.ory.hydra.model.AcceptConsentRequest;
import sh.ory.hydra.model.AcceptLoginRequest;
import sh.ory.hydra.model.CompletedRequest;
import sh.ory.hydra.model.ConsentRequest;
import sh.ory.hydra.model.FlushInactiveOAuth2TokensRequest;
import sh.ory.hydra.model.GenericError;
import sh.ory.hydra.model.HealthStatus;
import sh.ory.hydra.model.JSONWebKey;
import sh.ory.hydra.model.JSONWebKeySet;
import sh.ory.hydra.model.JsonWebKeySetGeneratorRequest;
import sh.ory.hydra.model.LoginRequest;
import sh.ory.hydra.model.LogoutRequest;
import sh.ory.hydra.model.OAuth2Client;
import sh.ory.hydra.model.OAuth2TokenIntrospection;
import sh.ory.hydra.model.PreviousConsentSession;
import sh.ory.hydra.model.RejectRequest;
import sh.ory.hydra.model.Version;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminApi
 */
@Ignore
public class AdminApiTest {

    private final AdminApi api = new AdminApi();

    
    /**
     * Accept a Consent Request
     *
     * When an authorization code, hybrid, or implicit OAuth 2.0 Flow is initiated, ORY Hydra asks the login provider to authenticate the subject and then tell ORY Hydra now about it. If the subject authenticated, he/she must now be asked if the OAuth 2.0 Client which initiated the flow should be allowed to access the resources on the subject&#39;s behalf.  The consent provider which handles this request and is a web app implemented and hosted by you. It shows a subject interface which asks the subject to grant or deny the client access to the requested scope (\&quot;Application my-dropbox-app wants write access to all your private files\&quot;).  The consent challenge is appended to the consent provider&#39;s URL to which the subject&#39;s user-agent (browser) is redirected to. The consent provider uses that challenge to fetch information on the OAuth2 request and then tells ORY Hydra if the subject accepted or rejected the request.  This endpoint tells ORY Hydra that the subject has authorized the OAuth 2.0 client to access resources on his/her behalf. The consent provider includes additional information, such as session data for access and ID tokens, and if the consent request should be used as basis for future requests.  The response contains a redirect URL which the consent provider should redirect the user-agent to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceptConsentRequestTest() throws ApiException {
        String consentChallenge = null;
        AcceptConsentRequest body = null;
        CompletedRequest response = api.acceptConsentRequest(consentChallenge, body);

        // TODO: test validations
    }
    
    /**
     * Accept a Login Request
     *
     * When an authorization code, hybrid, or implicit OAuth 2.0 Flow is initiated, ORY Hydra asks the login provider (sometimes called \&quot;identity provider\&quot;) to authenticate the subject and then tell ORY Hydra now about it. The login provider is an web-app you write and host, and it must be able to authenticate (\&quot;show the subject a login screen\&quot;) a subject (in OAuth2 the proper name for subject is \&quot;resource owner\&quot;).  The authentication challenge is appended to the login provider URL to which the subject&#39;s user-agent (browser) is redirected to. The login provider uses that challenge to fetch information on the OAuth2 request and then accept or reject the requested authentication process.  This endpoint tells ORY Hydra that the subject has successfully authenticated and includes additional information such as the subject&#39;s ID and if ORY Hydra should remember the subject&#39;s subject agent for future authentication attempts by setting a cookie.  The response contains a redirect URL which the login provider should redirect the user-agent to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceptLoginRequestTest() throws ApiException {
        String loginChallenge = null;
        AcceptLoginRequest body = null;
        CompletedRequest response = api.acceptLoginRequest(loginChallenge, body);

        // TODO: test validations
    }
    
    /**
     * Accept a Logout Request
     *
     * When a user or an application requests ORY Hydra to log out a user, this endpoint is used to confirm that logout request. No body is required.  The response contains a redirect URL which the consent provider should redirect the user-agent to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceptLogoutRequestTest() throws ApiException {
        String logoutChallenge = null;
        CompletedRequest response = api.acceptLogoutRequest(logoutChallenge);

        // TODO: test validations
    }
    
    /**
     * Generate a New JSON Web Key
     *
     * This endpoint is capable of generating JSON Web Key Sets for you. There a different strategies available, such as symmetric cryptographic keys (HS256, HS512) and asymetric cryptographic keys (RS256, ECDSA). If the specified JSON Web Key Set does not exist, it will be created.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createJsonWebKeySetTest() throws ApiException {
        String set = null;
        JsonWebKeySetGeneratorRequest body = null;
        JSONWebKeySet response = api.createJsonWebKeySet(set, body);

        // TODO: test validations
    }
    
    /**
     * Create an OAuth 2.0 Client
     *
     * Create a new OAuth 2.0 client If you pass &#x60;client_secret&#x60; the secret will be used, otherwise a random secret will be generated. The secret will be returned in the response and you will not be able to retrieve it later on. Write the secret down and keep it somwhere safe.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities. To manage ORY Hydra, you will need an OAuth 2.0 Client as well. Make sure that this endpoint is well protected and only callable by first-party components.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOAuth2ClientTest() throws ApiException {
        OAuth2Client body = null;
        OAuth2Client response = api.createOAuth2Client(body);

        // TODO: test validations
    }
    
    /**
     * Delete a JSON Web Key
     *
     * Use this endpoint to delete a single JSON Web Key.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJsonWebKeyTest() throws ApiException {
        String kid = null;
        String set = null;
        api.deleteJsonWebKey(kid, set);

        // TODO: test validations
    }
    
    /**
     * Delete a JSON Web Key Set
     *
     * Use this endpoint to delete a complete JSON Web Key Set and all the keys in that set.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJsonWebKeySetTest() throws ApiException {
        String set = null;
        api.deleteJsonWebKeySet(set);

        // TODO: test validations
    }
    
    /**
     * Deletes an OAuth 2.0 Client
     *
     * Delete an existing OAuth 2.0 Client by its ID.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities. To manage ORY Hydra, you will need an OAuth 2.0 Client as well. Make sure that this endpoint is well protected and only callable by first-party components.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOAuth2ClientTest() throws ApiException {
        String id = null;
        api.deleteOAuth2Client(id);

        // TODO: test validations
    }
    
    /**
     * Delete OAuth2 Access Tokens from a Client
     *
     * This endpoint deletes OAuth2 access tokens issued for a client from the database
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOAuth2TokenTest() throws ApiException {
        String clientId = null;
        api.deleteOAuth2Token(clientId);

        // TODO: test validations
    }
    
    /**
     * Flush Expired OAuth2 Access Tokens
     *
     * This endpoint flushes expired OAuth2 access tokens from the database. You can set a time after which no tokens will be not be touched, in case you want to keep recent tokens for auditing. Refresh tokens can not be flushed as they are deleted automatically when performing the refresh flow.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void flushInactiveOAuth2TokensTest() throws ApiException {
        FlushInactiveOAuth2TokensRequest body = null;
        api.flushInactiveOAuth2Tokens(body);

        // TODO: test validations
    }
    
    /**
     * Get Consent Request Information
     *
     * When an authorization code, hybrid, or implicit OAuth 2.0 Flow is initiated, ORY Hydra asks the login provider to authenticate the subject and then tell ORY Hydra now about it. If the subject authenticated, he/she must now be asked if the OAuth 2.0 Client which initiated the flow should be allowed to access the resources on the subject&#39;s behalf.  The consent provider which handles this request and is a web app implemented and hosted by you. It shows a subject interface which asks the subject to grant or deny the client access to the requested scope (\&quot;Application my-dropbox-app wants write access to all your private files\&quot;).  The consent challenge is appended to the consent provider&#39;s URL to which the subject&#39;s user-agent (browser) is redirected to. The consent provider uses that challenge to fetch information on the OAuth2 request and then tells ORY Hydra if the subject accepted or rejected the request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsentRequestTest() throws ApiException {
        String consentChallenge = null;
        ConsentRequest response = api.getConsentRequest(consentChallenge);

        // TODO: test validations
    }
    
    /**
     * Fetch a JSON Web Key
     *
     * This endpoint returns a singular JSON Web Key, identified by the set and the specific key ID (kid).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJsonWebKeyTest() throws ApiException {
        String kid = null;
        String set = null;
        JSONWebKeySet response = api.getJsonWebKey(kid, set);

        // TODO: test validations
    }
    
    /**
     * Retrieve a JSON Web Key Set
     *
     * This endpoint can be used to retrieve JWK Sets stored in ORY Hydra.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJsonWebKeySetTest() throws ApiException {
        String set = null;
        JSONWebKeySet response = api.getJsonWebKeySet(set);

        // TODO: test validations
    }
    
    /**
     * Get a Login Request
     *
     * When an authorization code, hybrid, or implicit OAuth 2.0 Flow is initiated, ORY Hydra asks the login provider (sometimes called \&quot;identity provider\&quot;) to authenticate the subject and then tell ORY Hydra now about it. The login provider is an web-app you write and host, and it must be able to authenticate (\&quot;show the subject a login screen\&quot;) a subject (in OAuth2 the proper name for subject is \&quot;resource owner\&quot;).  The authentication challenge is appended to the login provider URL to which the subject&#39;s user-agent (browser) is redirected to. The login provider uses that challenge to fetch information on the OAuth2 request and then accept or reject the requested authentication process.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoginRequestTest() throws ApiException {
        String loginChallenge = null;
        LoginRequest response = api.getLoginRequest(loginChallenge);

        // TODO: test validations
    }
    
    /**
     * Get a Logout Request
     *
     * Use this endpoint to fetch a logout request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogoutRequestTest() throws ApiException {
        String logoutChallenge = null;
        LogoutRequest response = api.getLogoutRequest(logoutChallenge);

        // TODO: test validations
    }
    
    /**
     * Get an OAuth 2.0 Client.
     *
     * Get an OAUth 2.0 client by its ID. This endpoint never returns passwords.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities. To manage ORY Hydra, you will need an OAuth 2.0 Client as well. Make sure that this endpoint is well protected and only callable by first-party components.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOAuth2ClientTest() throws ApiException {
        String id = null;
        OAuth2Client response = api.getOAuth2Client(id);

        // TODO: test validations
    }
    
    /**
     * Get Service Version
     *
     * This endpoint returns the service version typically notated using semantic versioning.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVersionTest() throws ApiException {
        Version response = api.getVersion();

        // TODO: test validations
    }
    
    /**
     * Introspect OAuth2 Tokens
     *
     * The introspection endpoint allows to check if a token (both refresh and access) is active or not. An active token is neither expired nor revoked. If a token is active, additional information on the token will be included. You can set additional data for a token by setting &#x60;accessTokenExtra&#x60; during the consent flow.  For more information [read this blog post](https://www.oauth.com/oauth2-servers/token-introspection-endpoint/).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void introspectOAuth2TokenTest() throws ApiException {
        String token = null;
        String scope = null;
        OAuth2TokenIntrospection response = api.introspectOAuth2Token(token, scope);

        // TODO: test validations
    }
    
    /**
     * Check Alive Status
     *
     * This endpoint returns a 200 status code when the HTTP server is up running. This status does currently not include checks whether the database connection is working.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isInstanceAliveTest() throws ApiException {
        HealthStatus response = api.isInstanceAlive();

        // TODO: test validations
    }
    
    /**
     * List OAuth 2.0 Clients
     *
     * This endpoint lists all clients in the database, and never returns client secrets. As a default it lists the first 100 clients. The &#x60;limit&#x60; parameter can be used to retrieve more clients, but it has an upper bound at 500 objects. Pagination should be used to retrieve more than 500 objects.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities. To manage ORY Hydra, you will need an OAuth 2.0 Client as well. Make sure that this endpoint is well protected and only callable by first-party components. The \&quot;Link\&quot; header is also included in successful responses, which contains one or more links for pagination, formatted like so: &#39;&lt;https://hydra-url/admin/clients?limit&#x3D;{limit}&amp;offset&#x3D;{offset}&gt;; rel&#x3D;\&quot;{page}\&quot;&#39;, where page is one of the following applicable pages: &#39;first&#39;, &#39;next&#39;, &#39;last&#39;, and &#39;previous&#39;. Multiple links can be included in this header, and will be separated by a comma.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOAuth2ClientsTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        List<OAuth2Client> response = api.listOAuth2Clients(limit, offset);

        // TODO: test validations
    }
    
    /**
     * Lists All Consent Sessions of a Subject
     *
     * This endpoint lists all subject&#39;s granted consent sessions, including client and granted scope. If the subject is unknown or has not granted any consent sessions yet, the endpoint returns an empty JSON array with status code 200 OK.   The \&quot;Link\&quot; header is also included in successful responses, which contains one or more links for pagination, formatted like so: &#39;&lt;https://hydra-url/admin/oauth2/auth/sessions/consent?subject&#x3D;{user}&amp;limit&#x3D;{limit}&amp;offset&#x3D;{offset}&gt;; rel&#x3D;\&quot;{page}\&quot;&#39;, where page is one of the following applicable pages: &#39;first&#39;, &#39;next&#39;, &#39;last&#39;, and &#39;previous&#39;. Multiple links can be included in this header, and will be separated by a comma.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSubjectConsentSessionsTest() throws ApiException {
        String subject = null;
        List<PreviousConsentSession> response = api.listSubjectConsentSessions(subject);

        // TODO: test validations
    }
    
    /**
     * Get Snapshot Metrics from the Hydra Service.
     *
     * If you&#39;re using k8s, you can then add annotations to your deployment like so:  &#x60;&#x60;&#x60; metadata: annotations: prometheus.io/port: \&quot;4445\&quot; prometheus.io/path: \&quot;/metrics/prometheus\&quot; &#x60;&#x60;&#x60;  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void prometheusTest() throws ApiException {
        api.prometheus();

        // TODO: test validations
    }
    
    /**
     * Reject a Consent Request
     *
     * When an authorization code, hybrid, or implicit OAuth 2.0 Flow is initiated, ORY Hydra asks the login provider to authenticate the subject and then tell ORY Hydra now about it. If the subject authenticated, he/she must now be asked if the OAuth 2.0 Client which initiated the flow should be allowed to access the resources on the subject&#39;s behalf.  The consent provider which handles this request and is a web app implemented and hosted by you. It shows a subject interface which asks the subject to grant or deny the client access to the requested scope (\&quot;Application my-dropbox-app wants write access to all your private files\&quot;).  The consent challenge is appended to the consent provider&#39;s URL to which the subject&#39;s user-agent (browser) is redirected to. The consent provider uses that challenge to fetch information on the OAuth2 request and then tells ORY Hydra if the subject accepted or rejected the request.  This endpoint tells ORY Hydra that the subject has not authorized the OAuth 2.0 client to access resources on his/her behalf. The consent provider must include a reason why the consent was not granted.  The response contains a redirect URL which the consent provider should redirect the user-agent to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rejectConsentRequestTest() throws ApiException {
        String consentChallenge = null;
        RejectRequest body = null;
        CompletedRequest response = api.rejectConsentRequest(consentChallenge, body);

        // TODO: test validations
    }
    
    /**
     * Reject a Login Request
     *
     * When an authorization code, hybrid, or implicit OAuth 2.0 Flow is initiated, ORY Hydra asks the login provider (sometimes called \&quot;identity provider\&quot;) to authenticate the subject and then tell ORY Hydra now about it. The login provider is an web-app you write and host, and it must be able to authenticate (\&quot;show the subject a login screen\&quot;) a subject (in OAuth2 the proper name for subject is \&quot;resource owner\&quot;).  The authentication challenge is appended to the login provider URL to which the subject&#39;s user-agent (browser) is redirected to. The login provider uses that challenge to fetch information on the OAuth2 request and then accept or reject the requested authentication process.  This endpoint tells ORY Hydra that the subject has not authenticated and includes a reason why the authentication was be denied.  The response contains a redirect URL which the login provider should redirect the user-agent to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rejectLoginRequestTest() throws ApiException {
        String loginChallenge = null;
        RejectRequest body = null;
        CompletedRequest response = api.rejectLoginRequest(loginChallenge, body);

        // TODO: test validations
    }
    
    /**
     * Reject a Logout Request
     *
     * When a user or an application requests ORY Hydra to log out a user, this endpoint is used to deny that logout request. No body is required.  The response is empty as the logout provider has to chose what action to perform next.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rejectLogoutRequestTest() throws ApiException {
        String logoutChallenge = null;
        RejectRequest body = null;
        api.rejectLogoutRequest(logoutChallenge, body);

        // TODO: test validations
    }
    
    /**
     * Invalidates All Login Sessions of a Certain User Invalidates a Subject&#39;s Authentication Session
     *
     * This endpoint invalidates a subject&#39;s authentication session. After revoking the authentication session, the subject has to re-authenticate at ORY Hydra. This endpoint does not invalidate any tokens and does not work with OpenID Connect Front- or Back-channel logout.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revokeAuthenticationSessionTest() throws ApiException {
        String subject = null;
        api.revokeAuthenticationSession(subject);

        // TODO: test validations
    }
    
    /**
     * Revokes Consent Sessions of a Subject for a Specific OAuth 2.0 Client
     *
     * This endpoint revokes a subject&#39;s granted consent sessions for a specific OAuth 2.0 Client and invalidates all associated OAuth 2.0 Access Tokens.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revokeConsentSessionsTest() throws ApiException {
        String subject = null;
        String client = null;
        Boolean all = null;
        api.revokeConsentSessions(subject, client, all);

        // TODO: test validations
    }
    
    /**
     * Update a JSON Web Key
     *
     * Use this method if you do not want to let Hydra generate the JWKs for you, but instead save your own.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateJsonWebKeyTest() throws ApiException {
        String kid = null;
        String set = null;
        JSONWebKey body = null;
        JSONWebKey response = api.updateJsonWebKey(kid, set, body);

        // TODO: test validations
    }
    
    /**
     * Update a JSON Web Key Set
     *
     * Use this method if you do not want to let Hydra generate the JWKs for you, but instead save your own.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateJsonWebKeySetTest() throws ApiException {
        String set = null;
        JSONWebKeySet body = null;
        JSONWebKeySet response = api.updateJsonWebKeySet(set, body);

        // TODO: test validations
    }
    
    /**
     * Update an OAuth 2.0 Client
     *
     * Update an existing OAuth 2.0 Client. If you pass &#x60;client_secret&#x60; the secret will be updated and returned via the API. This is the only time you will be able to retrieve the client secret, so write it down and keep it safe.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities. To manage ORY Hydra, you will need an OAuth 2.0 Client as well. Make sure that this endpoint is well protected and only callable by first-party components.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOAuth2ClientTest() throws ApiException {
        String id = null;
        OAuth2Client body = null;
        OAuth2Client response = api.updateOAuth2Client(id, body);

        // TODO: test validations
    }
    
}
