/**
 * GetAllFavoriteSourceByNewsApiKeyQuery
 * @summary
 * GetAllFavoriteSourceByNewsApiKeyQuery is a record class that represents the query to get all favorite news sources by API key.
 */
package com.acme.catchup.platform.news.domain.model.queries;

public record GetAllFavoriteSourceByNewsApiKeyQuery(String newsApiKey) {
    public GetAllFavoriteSourceByNewsApiKeyQuery {
        if (newsApiKey == null || newsApiKey.isBlank()) {
            throw new IllegalArgumentException("API Key cannot be null or empty");
        }
    }
}
