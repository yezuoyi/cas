package org.apereo.cas;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.regex.Pattern;

@RequiredArgsConstructor
@ToString(of = "title")
@Getter
public enum CasLabels {
    LABEL_AWS_CLOUD_DIRECTORY("AWS Cloud Directory"),
    LABEL_AWS_DYNAMODB("AWS DynamoDb", "dynamodb"),
    LABEL_ACCEPTABLE_USAGE_POLICY("Acceptable Usage Policy", "aup|terms of use"),
    LABEL_ANALYTICS__STATISTICS("Analytics & Statistics", "analytics|statistics"),
    LABEL_APACHE_CASSANDRA("Apache Cassandra"),
    LABEL_APACHE_GROOVY("Apache Groovy", "groovy"),
    LABEL_APACHE_IGNITE("Apache Ignite", "ignite"),
    LABEL_APACHE_SHIRO("Apache Shiro"),
    LABEL_APACHE_TOMCAT("Apache Tomcat", "tomcat"),
    LABEL_ARCHITECTURE_APIS("Architecture & APIs"),
    LABEL_ATTRIBUTE_CONSENT("Attribute Consent"),
    LABEL_ATTRIBUTE_RELEASE("Attribute Release"),
    LABEL_ATTRIBUTE_RESOLUTION("Attribute Resolution"),
    LABEL_AUDITS_LOGGING("Audits & Logging", "logs|log4j"),
    LABEL_AUTHENTICATION("Authentication", "authn"),
    LABEL_AUTHENTICATION_EVENTS("Authentication Events", "events"),
    LABEL_AUTHENTICATION_POLICIES("Authentication Policies"),
    LABEL_AUTHENTICATION_THROTTLING("Authentication Throttling"),
    LABEL_AUTHORIZATION_ACCESS_STRATEGY("Authorization & Access Strategy"),
    LABEL_BASIC_AUTHENTICATION("Basic Authentication"),
    LABEL_CAS_PROTOCOL("CAS Protocol"),
    LABEL_CLEARPASS("ClearPass"),
    LABEL_COMMAND_LINE_SHELL("Command-line Shell", "cli|shell"),
    LABEL_CONFIGURATION("Configuration"),
    LABEL_CONFIGURATION_DISCOVERY("Configuration Discovery"),
    LABEL_CONFIGURATION_METADATA("Configuration Metadata"),
    LABEL_COSMOSDB("CosmosDb"),
    LABEL_COUCHDB("CouchDb"),
    LABEL_COUCHBASE("Couchbase"),
    LABEL_DELEGATED_AUTHENTICATION_PAC4J("Delegated Authentication Pac4J"),
    LABEL_DELEGATED_AUTHENTICATION_WS_FED("Delegated Authentication WS-FED"),
    LABEL_DEPENDENCIES_MODULES("Dependencies & Modules"),
    LABEL_DIGEST_AUTHENTICATION("Digest Authentication"),
    LABEL_DOCUMENTATION("Documentation", "docs|markdown"),
    LABEL_EHCACHE("EhCache"),
    LABEL_ELECTROFENCE_RISK_BASED_AUTHN("Electrofence Risk-based AuthN"),
    LABEL_EMAIL_SMS_NOTIFICATIONS("Email & SMS Notifications"),
    LABEL_GUA("GUA"),
    LABEL_GEOLOCATION("GeoLocation"),
    LABEL_GRADLE_BUILD_RELEASE("Gradle Build & Release", "gradle|sonatype|snapshot"),
    LABEL_HAZELCAST("Hazelcast", "hz"),
    LABEL_INFINISPAN("Infinispan"),
    LABEL_INTERNATIONALIZATION("Internationalization", "localization|localized|message bundle|translation"),
    LABEL_INTERRUPT_NOTIFICATIONS("Interrupt Notifications"),
    LABEL_JAAS("JAAS"),
    LABEL_JDBC_HIBERNATE_JPA("JDBC & Hibernate & JPA", "mysql|postgres|oracle|mariadb|jpa|hibernate"),
    LABEL_JWT_AUTHN_TICKETS("JWT AuthN & Tickets"),
    LABEL_LDAP_ACTIVE_DIRECTORY("LDAP & Active Directory"),
    LABEL_LOGOUT_SLO("Logout & SLO"),
    LABEL_MFA("MFA", "multifactor authentication"),
    LABEL_MFA_AUTHY("MFA Authy"),
    LABEL_MFA_BYPASS("MFA Bypass"),
    LABEL_MFA_DUO_SECURITY("MFA Duo Security", "duo"),
    LABEL_MFA_FIDO_U2F("MFA FIDO U2F"),
    LABEL_MFA_GOOGLE_AUTHENTICATOR("MFA Google Authenticator", "gauth"),
    LABEL_MFA_SWIVEL_SECURE("MFA Swivel Secure", "swivel"),
    LABEL_MFA_TRUSTED_DEVICES("MFA Trusted Devices"),
    LABEL_MFA_YUBIKEY("MFA YubiKey"),
    LABEL_MEMCACHED("Memcached"),
    LABEL_MONGODB("MongoDb"),
    LABEL_MONITORING("Monitoring", "healthcheck|status"),
    LABEL_OAUTH2_PROTOCOL("OAuth2 Protocol"),
    LABEL_OPENID_CONNECT_PROTOCOL("OpenID Connect Protocol"),
    LABEL_OPENID_PROTOCOL("OpenID Protocol"),
    LABEL_PAC4J("Pac4J"),
    LABEL_PASSWORD_ENCODING("Password Encoding"),
    LABEL_PASSWORD_MANAGEMENT("Password Management"),
    LABEL_PASSWORD_POLICY("Password Policy"),
    LABEL_PENDING("Pending"),
    LABEL_PENDING_PORT_FORWARD("Pending: Port Forward"),
    LABEL_PERFORMANCE_LOAD_TESTS("Performance & Load Tests"),
    LABEL_PRINCIPAL_RESOLUTION("Principal Resolution"),
    LABEL_PROPOSAL_DECLINED("Proposal Declined"),
    LABEL_PROXY_AUTHENTICATION("Proxy Authentication"),
    LABEL_RADIUS("RADIUS"),
    LABEL_REST_PROTOCOL("REST Protocol"),
    LABEL_REDIS("Redis"),
    LABEL_REFACTORING_CODE_CLEANUP("Refactoring & Code CleanUp"),
    LABEL_REMEMBER_ME("Remember-Me"),
    LABEL_SAML_CORE("SAML Core"),
    LABEL_SAML_MDUI("SAML MDUI"),
    LABEL_SAML1_PROTOCOL("SAML1 Protocol"),
    LABEL_SAML2_ECP("SAML2 ECP"),
    LABEL_SAML2_GOOGLE_APPS("SAML2 Google Apps"),
    LABEL_SAML2_PROTOCOL("SAML2 Protocol", "saml2"),
    LABEL_SAML2_SP("SAML2 SP"),
    LABEL_SPNEGO("SPNEGO"),
    LABEL_SSO_COOKIES("SSO & Cookies"),
    LABEL_SEE_MAINTENANCE_POLICY("See Maintenance Policy"),
    LABEL_SERVICE_EXPIRATION_POLICY("Service Expiration Policy"),
    LABEL_SERVICES_REGISTRIES("Services & Registries", "service registry|service files"),
    LABEL_SESSION_MANAGEMENT("Session Management"),
    LABEL_SHIBBOLETH("Shibboleth"),
    LABEL_SIGNING_ENCRYPTION("Signing & Encryption"),
    LABEL_SPRING_BOOT("Spring Boot"),
    LABEL_SPRING_BOOT_ADMIN_SERVER("Spring Boot Admin Server"),
    LABEL_SPRING_CLOUD("Spring Cloud"),
    LABEL_SPRING_CLOUD_CONFIGURATION_SERVER("Spring Cloud Configuration Server"),
    LABEL_SPRING_CLOUD_EUREKA_DISCOVERY("Spring Cloud Eureka Discovery", "eureka"),
    LABEL_SPRING_CLOUD_VAULT("Spring Cloud Vault", "vault"),
    LABEL_SPRING_CLOUD_ZIPKIN("Spring Cloud Zipkin", "zipkin"),
    LABEL_SPRING_WEBFLOW("Spring Webflow", "webflow"),
    LABEL_STATISTICS_METRICS("Statistics & Metrics", "metrics"),
    LABEL_SURROGATE_AUTHENTICATION("Surrogate Authentication", "surrogate|impersonation"),
    LABEL_TICKET_EXPIRATION_POLICY("Ticket Expiration Policy"),
    LABEL_TICKET_VALIDATION("Ticket Validation"),
    LABEL_TICKETS_REGISTRIES("Tickets & Registries"),
    LABEL_UNIT_INTEGRATION_TESTS("Unit/Integration Tests", "junit|tests"),
    LABEL_USER_INTERFACE_THEMES("User Interface & Themes", "ux|thymeleaf|html|views"),
    LABEL_WS_FED_PROTOCOL("WS-FED Protocol"),
    LABEL_X509("X.509", "x509"),
    LABEL_RECAPTCHA("reCAPTCHA");

    private final String title;
    private Pattern keywords;

    CasLabels(final String title, final String keywords) {
        this.title = title;
        if (keywords != null) {
            this.keywords = Pattern.compile(keywords, Pattern.CASE_INSENSITIVE);
        }
    }
}
