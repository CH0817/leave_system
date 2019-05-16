DROP TABLE IF EXISTS `employee_role`;
DROP TABLE IF EXISTS `role`;
DROP TABLE IF EXISTS `phone`;
DROP TABLE IF EXISTS `mobile`;
DROP TABLE IF EXISTS `fax`;
DROP TABLE IF EXISTS `address`;
DROP TABLE IF EXISTS `leave_log`;
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
    create_date DATETIME    NOT NULL,
    update_date DATETIME,
    PRIMARY KEY (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS employee_role
(
    employee    VARCHAR(36) NOT NULL,
    role        VARCHAR(36) NOT NULL,
    create_date DATETIME    NOT NULL,
    update_date DATETIME,
    PRIMARY KEY (employee, role),
    FOREIGN KEY (employee) REFERENCES employee (id),
    FOREIGN KEY (role) REFERENCES role (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS leave_log
(
    id           VARCHAR(36) NOT NULL,
    leave_date   DATE        NOT NULL,
    hours        INT         NOT NULL,
    create_date  DATETIME    NOT NULL,
    update_date  DATETIME,
    employee     VARCHAR(36) NOT NULL,
    approve      VARCHAR(36),
    approve_date DATETIME,
    PRIMARY KEY (id),
    FOREIGN KEY (employee) REFERENCES employee (id),
    FOREIGN KEY (approve) REFERENCES employee (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS phone
(
    id          VARCHAR(36) NOT NULL,
    phone       VARCHAR(20) NOT NULL UNIQUE,
    create_date DATETIME    NOT NULL,
    update_date DATETIME,
    employee    VARCHAR(36),
    company     VARCHAR(36),
    PRIMARY KEY (id),
    FOREIGN KEY (employee) REFERENCES employee (id),
    FOREIGN KEY (company) REFERENCES company (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS mobile
(
    id          VARCHAR(36) NOT NULL,
    mobile      VARCHAR(20) NOT NULL UNIQUE,
    create_date DATETIME    NOT NULL,
    update_date DATETIME,
    employee    VARCHAR(36),
    company     VARCHAR(36),
    PRIMARY KEY (id),
    FOREIGN KEY (employee) REFERENCES employee (id),
    FOREIGN KEY (company) REFERENCES company (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS fax
(
    id          VARCHAR(36) NOT NULL,
    fax         VARCHAR(20) NOT NULL UNIQUE,
    create_date DATETIME    NOT NULL,
    update_date DATETIME,
    employee    VARCHAR(36),
    company     VARCHAR(36),
    PRIMARY KEY (id),
    FOREIGN KEY (employee) REFERENCES employee (id),
    FOREIGN KEY (company) REFERENCES company (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS address
(
    id          VARCHAR(36)  NOT NULL,
    zip         VARCHAR(10)  NOT NULL,
    address     VARCHAR(100) NOT NULL,
    create_date DATETIME     NOT NULL,
    update_date DATETIME,
    employee    VARCHAR(36),
    company     VARCHAR(36),
    PRIMARY KEY (id),
    FOREIGN KEY (employee) REFERENCES employee (id),
    FOREIGN KEY (company) REFERENCES company (id)
) ENGINE = InnoDB;