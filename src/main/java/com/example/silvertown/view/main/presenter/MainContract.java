package com.example.silvertown.view.main.presenter;

public interface MainContract {

    interface View {

        void showToast(String title);
    }

    interface Presenter{
        void attachView(View view);
        void detachView();

    }

}
