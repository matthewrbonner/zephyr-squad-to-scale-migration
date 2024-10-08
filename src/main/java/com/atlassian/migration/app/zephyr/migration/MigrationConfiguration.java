package com.atlassian.migration.app.zephyr.migration;

import com.atlassian.migration.app.zephyr.common.ApiConfiguration;

public record MigrationConfiguration(
        ApiConfiguration apiConfiguration,
        int pageSteps,
        String cycleNamePlaceHolder,
        String attachmentsMappedCsvFile,
        String databaseType,
        String attachmentsBaseFolder) {
}
