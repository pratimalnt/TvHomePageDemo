package androidx.leanback.app;

public class HackyBrowseSupportFragment extends BrowseFragment {
    @Override
    void startHeadersTransitionInternal(boolean withHeaders) {
        // Do nothing. This avoids the transition.
    }
}
