package edu.edo.torabentoapps.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.beardedhen.androidbootstrap.BootstrapEditText;

import java.util.zip.Inflater;

import edu.edo.torabentoapps.R;
import edu.edo.torabentoapps.daftarreseller;

import static edu.edo.torabentoapps.R.id.daftarreseller;

/**
 * Created by anggy on 17/08/2017.
 */

public class AkunFragment extends Fragment {

    BootstrapEditText username,password;
    BootstrapButton login,daftar;

    public AkunFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.login_activity, container, false);

        username = (BootstrapEditText)view.findViewById(R.id.username);
        password = (BootstrapEditText)view.findViewById(R.id.password);
        login = (BootstrapButton)view.findViewById(R.id.btnbirumuda);
        daftar = (BootstrapButton)view.findViewById(R.id.btnmerah);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), edu.edo.torabentoapps.daftarreseller.class));
            }
        });

        return view;
    }
}
