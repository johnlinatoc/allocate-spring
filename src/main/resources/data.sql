INSERT INTO users (username, password, enabled)
    values ( 'user',
            '789',
            true);

INSERT INTO users (username, password, enabled)
    values ( 'admin',
            '789',
            true);

INSERT INTO authorities (username, authority)
    values ( 'user', 'ROLE_USER' );

INSERT INTO authorities (username, authority)
    values ( 'admin', 'ROLE_ADMIN' );