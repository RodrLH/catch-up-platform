/**
 * FavoriteSourceQueryService.java
 * @summary
 * The FavoriteSourceQueryService interface is responsible for handling the
 * GetFavoriteSourceByIdQuery query.
 * It is implemented by the FavoriteSourceQueryServiceImpl class.
 * @author
 * { author.name author.email }
 */
package com.acme.catchup.platform.news.domain.services;

import com.acme.catchup.platform.news.domain.model.aggregates.FavoriteSource;
import com.acme.catchup.platform.news.domain.model.queries.GetFavoriteSourceByIdQuery;

import java.util.Optional;

public interface FavoriteSourceQueryService {
    Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query);
}
