package courses.pluralsight.com.tabianconsulting.issues;

import android.content.Context;
<<<<<<< HEAD
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
=======
>>>>>>> Module_7.5_End
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
<<<<<<< HEAD
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ProgressBar;
=======
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
>>>>>>> Module_7.5_End

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.DecodeFormat;
<<<<<<< HEAD
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.FutureTarget;
=======
import com.bumptech.glide.load.engine.GlideException;
>>>>>>> Module_7.5_End
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

import courses.pluralsight.com.tabianconsulting.R;


/**
 * Created by User on 3/3/2018.
 */

public class FullScreenImageFragment extends Fragment
{

    private static final String TAG = "FullScreenImageFragment";

    //widgets
    private ScalingImageView mImageView;

    //vars
    public Object mImageResource;
    private IIssueDetail mIIssueDetail;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Bundle bundle = this.getArguments();
//        mImageResource = bundle.getString(getString(R.string.intent_image));

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_full_screen_product, container, false);
        mImageView = view.findViewById(R.id.fullscreen_image);

        setImage();

        return view;
    }

    private void setImage(){

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;

        RequestOptions options = new RequestOptions()
                .format(DecodeFormat.PREFER_RGB_565)
                .override(width, height)
                .centerInside()
                .placeholder(R.drawable.default_avatar);

        mIIssueDetail.showProgressBar();

        RequestListener listener = new RequestListener() {
            @Override
            public boolean onLoadFailed(@Nullable GlideException e, Object model, Target target, boolean isFirstResource) {
                mIIssueDetail.hideProgressBar();
                return false;
            }

            @Override
            public boolean onResourceReady(Object resource, Object model, Target target, DataSource dataSource, boolean isFirstResource) {
                mIIssueDetail.hideProgressBar();
                return false;
            }
        };

        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(mImageResource)
                .listener(listener)
                .into(mImageView);

    }

    public void setImageResource(Object resource){
        mImageResource = resource;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mIIssueDetail = (IIssueDetail) getActivity();
    }

<<<<<<< HEAD
//    @Override
//    public void onStart() {
//        super.onStart();
//        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        if(((AppCompatActivity)getActivity()).getSupportActionBar().isShowing()){
//            ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
//        }
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        ((AppCompatActivity)getActivity()).getSupportActionBar().show();
//    }
=======
>>>>>>> Module_7.5_End
}



























