SET foreign_key_checks = 0;

DROP TABLE IF EXISTS `employee_role`;
DROP TABLE IF EXISTS `role`;
DROP TABLE IF EXISTS `company_phone`;
DROP TABLE IF EXISTS `company_mobile`;
DROP TABLE IF EXISTS `company_fax`;
DROP TABLE IF EXISTS `company_email`;
DROP TABLE IF EXISTS `company_address`;
DROP TABLE IF EXISTS `employee_phone`;
DROP TABLE IF EXISTS `employee_mobile`;
DROP TABLE IF EXISTS `employee_fax`;
DROP TABLE IF EXISTS `employee_address`;
DROP TABLE IF EXISTS `leave_history`;
DROP TABLE IF EXISTS `employee`;
DROP TABLE IF EXISTS `company`;

CREATE TABLE IF NOT EXISTS company
(
    id           VARCHAR(36) NOT NULL,
    name         VARCHAR(15) NOT NULL,
    principal_id VARCHAR(36),
    create_date  DATETIME    NOT NULL,
    update_date  DATETIME,
    PRIMARY KEY (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS employee
(
    id            VARCHAR(36) NOT NULL,
    name          VARCHAR(15) NOT NULL,
    password      VARCHAR(68) NOT NULL,
    company_id    VARCHAR(36) NOT NULL,
    work_space_id VARCHAR(36),
    manager_id    VARCHAR(36),
    arrive_date   DATETIME    NOT NULL,
    leave_date    DATETIME,
    create_date   DATETIME    NOT NULL,
    update_date   DATETIME,
    PRIMARY KEY (id),
    FOREIGN KEY (company_id) REFERENCES company (id),
    FOREIGN KEY (work_space_id) REFERENCES company (id),
    FOREIGN KEY (manager_id) REFERENCES employee (id)
) ENGINE = InnoDB;

ALTER TABLE company
    ADD FOREIGN KEY (principal_id) REFERENCES employee (id);

CREATE TABLE IF NOT EXISTS role
(
    id          VARCHAR(36) NOT NULL,
    name        VARCHAR(15) NOT NULL UNIQUE,
    description TEXT,
    create_date DATETIME    NOT NULL,
    update_date DATETIME,
    PRIMARY KEY (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS employee_role
(
    employee_id VARCHAR(36) NOT NULL,
    role_id     VARCHAR(36) NOT NULL,
    create_date DATETIME    NOT NULL,
    update_date DATETIME,
    PRIMARY KEY (employee_id, role_id),
    FOREIGN KEY (employee_id) REFERENCES employee (id),
    FOREIGN KEY (role_id) REFERENCES role (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS leave_history
(
    id                 VARCHAR(36) NOT NULL,
    start_time         DATETIME    NOT NULL,
    end_time           DATETIME    NOT NULL,
    create_date        DATETIME    NOT NULL,
    update_date        DATETIME,
    employee_id        VARCHAR(36) NOT NULL,
    approve_manager_id VARCHAR(36),
    approve_date       DATETIME,
    description        TEXT,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id) REFERENCES employee (id),
    FOREIGN KEY (approve_manager_id) REFERENCES employee (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS employee_phone
(
    id          VARCHAR(36) NOT NULL,
    area_code   VARCHAR(5)  NOT NULL,
    phone       VARCHAR(20) NOT NULL,
    employee_id VARCHAR(36) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id) REFERENCES employee (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS company_phone
(
    id         VARCHAR(36) NOT NULL,
    area_code  VARCHAR(5)  NOT NULL,
    phone      VARCHAR(20) NOT NULL,
    company_id VARCHAR(36) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (company_id) REFERENCES company (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS employee_mobile
(
    id          VARCHAR(36) NOT NULL,
    mobile      VARCHAR(20) NOT NULL,
    employee_id VARCHAR(36) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id) REFERENCES employee (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS company_mobile
(
    id         VARCHAR(36) NOT NULL,
    mobile     VARCHAR(20) NOT NULL,
    company_id VARCHAR(36) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (company_id) REFERENCES company (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS employee_fax
(
    id          VARCHAR(36) NOT NULL,
    area_code   VARCHAR(5)  NOT NULL,
    fax         VARCHAR(20) NOT NULL,
    employee_id VARCHAR(36) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id) REFERENCES employee (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS company_fax
(
    id         VARCHAR(36) NOT NULL,
    area_code  VARCHAR(5)  NOT NULL,
    fax        VARCHAR(20) NOT NULL,
    company_id VARCHAR(36) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (company_id) REFERENCES company (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS employee_email
(
    id          VARCHAR(36) NOT NULL,
    email       VARCHAR(20) NOT NULL,
    employee_id VARCHAR(36) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id) REFERENCES employee (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS company_email
(
    id         VARCHAR(36) NOT NULL,
    email      VARCHAR(20) NOT NULL,
    company_id VARCHAR(36) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (company_id) REFERENCES company (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS employee_address
(
    id          VARCHAR(36)  NOT NULL,
    zip         VARCHAR(10),
    address     VARCHAR(100) NOT NULL,
    employee_id VARCHAR(36)  NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id) REFERENCES employee (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS company_address
(
    id         VARCHAR(36)  NOT NULL,
    zip        VARCHAR(10),
    address    VARCHAR(100) NOT NULL,
    company_id VARCHAR(36)  NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (company_id) REFERENCES company (id)
) ENGINE = InnoDB;

SET foreign_key_checks = 1;