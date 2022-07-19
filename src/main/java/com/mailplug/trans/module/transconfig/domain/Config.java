package com.mailplug.trans.module.transconfig.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "config")
@Data
@RequiredArgsConstructor
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String host;

    private String sid;

    private String domain;

    private String localPath;

    private String mailIp;

    private String mailPort;

    private String mailId;

    private String mailPw;

    private String remoteMailPath;

    private String remoteDbIp;

    private String remoteDbId;

    private String remoteDbPw;

    private String remoteDbName;

    private String remoteDbTableName;

    private String remoteBackupPath;

    private String officeDbIp;

    private String officeDbPort;

    private String officeDbId;

    private String officeDbPw;

    private String officeDbName;

    private String backupDir;

}
