/**
 * FavoriteSourceQueryService Implementation
 *
 * @summary
 * The FavoriteSourceQueryServiceImpl class is an implementation of the FavoriteSourceQueryService interface.
 * It is responsible for handling the GetAllFavoriteSourceByNewsApiKeyQuery, GetFavoriteSourceByIdQuery, and GetFavoriteSourceByNewsApiKeyAndSourceIdQuery queries.
 *
 */
package com.acme.catchup.platform.news.application.internal.queryservices;

import com.acme.catchup.platform.news.domain.model.aggregates.FavoriteSource;
import com.acme.catchup.platform.news.domain.model.queries.GetFavoriteSourceByIdQuery;
import com.acme.catchup.platform.news.domain.services.FavoriteSourceQueryService;
import com.acme.catchup.platform.news.infrastructure.persistance.jpa.FavoriteSourceRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FavoriteSourceQueryServiceImpl implements FavoriteSourceQueryService {
    private final FavoriteSourceRepository favoriteSourceRepository;

    public FavoriteSourceQueryServiceImpl(FavoriteSourceRepository favoriteSourceRepository) {
        this.favoriteSourceRepository = favoriteSourceRepository;
    }

    /**
     * Handles the GetFavoriteSourceByIdQuery query.
     *
     * @param query - the GetFavoriteSourceByIdQuery query
     * @return an Optional of FavoriteSource
     */
    @Override
    public Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query) {
        return favoriteSourceRepository.findById(query.id());
    }
}
