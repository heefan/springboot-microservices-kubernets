package com.heefan.api.composite.product;

// TODO: here should use Annotation to do getter/setter

public class RecommendationSummary {
    private final int recommendationId;
    private final String author;
    private final int rate;

    public RecommendationSummary(int recommendationId, String author, int rate) {
        this.recommendationId = recommendationId;
        this.author = author;
        this.rate = rate;
    }

    public int getRecommendationId() {
        return recommendationId;
    }

    public String getAuthor() {
        return author;
    }

    public int getRate() {
        return rate;
    }
}

