DROP TABLE IF EXISTS `employee_role`;
DROP TABLE IF EXISTS `role`;
DROP TABLE IF EXISTS `phone`;
DROP TABLE IF EXISTS `mobile`;
DROP TABLE IF EXISTS `fax`;
DROP TABLE IF EXISTS `address`;
DROP TABLE IF EXISTS `leave_history`;
DROP TABLE IF EXISTS `employee`;
DROP TABLE IF EXISTS `company`;

CREATE TABLE IF NOT EXISTS company
(
    id          VARCHAR(36) NOT NULL,
    name        VARCHAR(15) NOT NULL,
    principal   VARCHAR(36) NOT NULL,
    create_date DATETIME    NOT NULL,
    update_date DATETIME,
    PRIMARY KEY (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS employee
(
    id          VARCHAR(36) NOT NULL,
    name        VARCHAR(15) NOT NULL,
    email       VARCHAR(50) NOT NULL,
    password    VARCHAR(36) NOT NULL,
    company     VARCHAR(36) NOT NULL,
    work_space  VARCHAR(36) NOT NULL,
    manager     VARCHAR(36) NOT NULL,
    arrive_date DATETIME    NOT NULL,
    leave_date  DATETIME,
    create_date DATETIME    NOT NULL,
    update_date DATETIME,
    PRIMARY KEY (id),
    FOREIGN KEY (company) REFERENCES company (id),
    FOREIGN KEY (work_space) REFERENCES company (id),
    FOREIGN KEY (manager) REFERENCES employee (id)
) ENGINE = InnoDB;

ALTER TABLE company
    ADD CONSTRAINT FOREIGN KEY (principal) REFERENCES employee (id);

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
    id                  VARCHAR(36) NOT NULL,
    start_time          DATETIME    NOT NULL,
    end_time            DATETIME    NOT NULL,
    create_date         DATETIME    NOT NULL,
    update_date         DATETIME,
    employee_id         VARCHAR(36) NOT NULL,
    approve_employee_id VARCHAR(36),
    approve_date        DATETIME,
    description         TEXT,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id) REFERENCES employee (id),
    FOREIGN KEY (approve_employee_id) REFERENCES employee (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS employee_phone
(
    phone       VARCHAR(20) NOT NULL UNIQUE,
    employee_id VARCHAR(36),
    PRIMARY KEY (phone, employee_id),
    FOREIGN KEY (employee_id) REFERENCES employee (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS company_phone
(
    phone      VARCHAR(20) NOT NULL UNIQUE,
    company_id VARCHAR(36),
    PRIMARY KEY (phone, company_id),
    FOREIGN KEY (company_id) REFERENCES company (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS employee_mobile
(
    mobile      VARCHAR(20) NOT NULL UNIQUE,
    employee_id VARCHAR(36),
    PRIMARY KEY (mobile, employee_id),
    FOREIGN KEY (employee_id) REFERENCES employee (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS company_mobile
(
    mobile     VARCHAR(20) NOT NULL UNIQUE,
    company_id VARCHAR(36),
    PRIMARY KEY (mobile, company_id),
    FOREIGN KEY (company_id) REFERENCES company (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS employee_fax
(
    fax         VARCHAR(20) NOT NULL UNIQUE,
    employee_id VARCHAR(36),
    PRIMARY KEY (fax, employee_id),
    FOREIGN KEY (employee_id) REFERENCES employee (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS company_fax
(
    fax        VARCHAR(20) NOT NULL UNIQUE,
    company_id VARCHAR(36),
    PRIMARY KEY (fax, company_id),
    FOREIGN KEY (company_id) REFERENCES company (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS employee_address
(
    zip         VARCHAR(10)  NOT NULL,
    address     VARCHAR(100) NOT NULL,
    employee_id VARCHAR(36),
    PRIMARY KEY (employee_id),
    FOREIGN KEY (employee_id) REFERENCES employee (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS company_address
(
    zip        VARCHAR(10)  NOT NULL,
    address    VARCHAR(100) NOT NULL,
    company_id VARCHAR(36),
    PRIMARY KEY (company_id),
    FOREIGN KEY (company_id) REFERENCES company (id)
) ENGINE = InnoDB;