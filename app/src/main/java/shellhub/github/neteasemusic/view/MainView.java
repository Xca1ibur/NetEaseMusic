package shellhub.github.neteasemusic.view;

import java.util.List;

import shellhub.github.neteasemusic.model.entities.MusicMenu;
import shellhub.github.neteasemusic.model.entities.NavProfile;
import shellhub.github.neteasemusic.response.banner.BannersItem;
import shellhub.github.neteasemusic.response.detail.DetailResponse;
import shellhub.github.neteasemusic.response.recommend.resource.RecommendSongItem;

public interface MainView extends BaseView {

    void updateNavProfile(NavProfile navProfile);

    void updateDetail(DetailResponse detailResponse);

    void updateMusicMenu(List<MusicMenu> musicMenus);

    void updateMiniCoverAndTitle();

    void setUpNavHeader();

    void navigateToLocalView();

    void navigateToRecentPlayView();

    void navigateToDownloadsView();

    void navigateToStationsView();

    void navigateToFavorites();

    void navigatePlaylist(RecommendSongItem recommendSongItem);

    void showNetworkError(String errorMsg);

    void showBanner(List<BannersItem> bannersItems);

    void showRecommendSongList(List<RecommendSongItem> recommendSongItems);

}
