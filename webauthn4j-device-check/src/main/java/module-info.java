module com.webauthn4j.appattest {
    requires com.webauthn4j.util;
    requires com.webauthn4j.core;

    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.dataformat.cbor;

    requires org.jetbrains.annotations;

    exports com.webauthn4j.appattest;
    exports com.webauthn4j.appattest.authenticator;
    exports com.webauthn4j.appattest.converter.jackson;
    exports com.webauthn4j.appattest.converter.jackson.serializer;
    exports com.webauthn4j.appattest.data;
    exports com.webauthn4j.appattest.data.attestation.statement;
    exports com.webauthn4j.appattest.server;
    exports com.webauthn4j.appattest.verifier;
}
