package shellhub.github.neteasemusic.view;

import shellhub.github.neteasemusic.response.comment.CommentResponse;

public interface CommentView extends BaseView{
    void onLoaded(CommentResponse commentResponse);

    void updateTitle(String title);
}
