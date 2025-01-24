package com.client.gemini.model;

import java.util.List;

public class ResponseGemini {
    private List<Candidate> candidates;
    private UsageMetaData usageMetadata;
    private String modelVersion;

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    public UsageMetaData getUsageMetadata() {
        return usageMetadata;
    }

    public void setUsageMetadata(UsageMetaData usageMetadata) {
        this.usageMetadata = usageMetadata;
    }

    public String getModelVersion() {
        return modelVersion;
    }

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }
}
