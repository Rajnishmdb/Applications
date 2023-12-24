package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ELECTIVE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elective);
    }
    public void f_d_communicate(View v){
        Intent jump1 = new Intent(ELECTIVE.this,F_D_Communication.class);
        startActivity(jump1);
    }
    public void realTime(View v){
        Intent jump2 = new Intent(ELECTIVE.this,Real_Time_Sys.class);
        startActivity(jump2);
    }
    public void crypto(View v){
        Intent jump3 = new Intent(ELECTIVE.this,CRYPTOGRAPHY.class);
        startActivity(jump3);
    }
    public void m_w_compute(View v){
        Intent jump4 = new Intent(ELECTIVE.this,MOB_WIRE_COMPUTING.class);
        startActivity(jump4);
    }
    public void dis_database(View v){
        Intent jump5 = new Intent(ELECTIVE.this,DIST_DATABASE.class);
        startActivity(jump5);
    }
    public void par_compute(View v){
        Intent jump6 = new Intent(ELECTIVE.this,PARA_COMPUTING.class);
        startActivity(jump6);
    }
    public void avd_C_arch(View v){
        Intent jump7 = new Intent(ELECTIVE.this,AVD_C_ARCH.class);
        startActivity(jump7);
    }
    public void per_eval_cs(View v){
        Intent jump8 = new Intent(ELECTIVE.this,PER_EVAL_C_SYS.class);
        startActivity(jump8);
    }
    public void optimize_theory(View v){
        Intent jump9 = new Intent(ELECTIVE.this,OPT_THEORY.class);
        startActivity(jump9);
    }
    public void pattern_recog(View v){
        Intent jump10 = new Intent(ELECTIVE.this,PATTERN_RECOG.class);
        startActivity(jump10);
    }
    public void gene_algo(View v){
        Intent jump11 = new Intent(ELECTIVE.this,GENETIC_ALGO.class);
        startActivity(jump11);
    }
    public void n_lang_pro(View v){
        Intent jump12 = new Intent(ELECTIVE.this,N_L_P.class);
        startActivity(jump12);
    }
    public void c_Geometry(View v){
        Intent jump13 = new Intent(ELECTIVE.this,C_GEOMATRY.class);
        startActivity(jump13);
    }
    public void c_Graph(View v){
        Intent jump14 = new Intent(ELECTIVE.this,C_GRAPHICS.class);
        startActivity(jump14);
    }
    public void n_net_app(View v){
        Intent jump15 = new Intent(ELECTIVE.this,NEURAL_NET_APP.class);
        startActivity(jump15);
    }
    public void speech_pro(View v){
        Intent jump16 = new Intent(ELECTIVE.this,SPEECH_PRO.class);
        startActivity(jump16);
    }

    public void robot_app(View v){
        Intent jump18 = new Intent(ELECTIVE.this,ROBO_R_APP.class);
        startActivity(jump18);
    }
    public void network_secure(View v){
        Intent jump19 = new Intent(ELECTIVE.this,NETWORK_SECURE.class);
        startActivity(jump19);
    }
    public void intelligent(View v){
        Intent jump20 = new Intent(ELECTIVE.this,INTEL_INSTRUMENT.class);
        startActivity(jump20);
    }
    public void m_ic_fab(View v){
        Intent jump21 = new Intent(ELECTIVE.this,MICRO_IC_DGN_FAB.class);
        startActivity(jump21);
    }
    public void ecom_erp(View v){
        Intent jump22 = new Intent(ELECTIVE.this,ECOM_ERP.class);
        startActivity(jump22);
    }
    public void img_pro(View v){
        Intent jump23 = new Intent(ELECTIVE.this,IMG_PRO_GIS.class);
        startActivity(jump23);
    }
    public void cad(View v){
        Intent jump24 = new Intent(ELECTIVE.this,C_ADDED_DGN.class);
        startActivity(jump24);
    }

    public void com_Sys(View v){
        Intent jump26 = new Intent(ELECTIVE.this,I_COMMUNICATE_SYS.class);
        startActivity(jump26);
    }
    public void d_img_pro(View v){
        Intent jump27 = new Intent(ELECTIVE.this,D_IMG_PRO.class);
        startActivity(jump27);
    }
    public void embedded(View v){
        Intent jump28 = new Intent(ELECTIVE.this,EMBEDDED_SYS_DGN.class);
        startActivity(jump28);
    }
    public void vlsi(View v){
        Intent jump29 = new Intent(ELECTIVE.this,VLSI_DGN.class);
        startActivity(jump29);
    }
    public void dg_tel_com(View v){
        Intent jump30 = new Intent(ELECTIVE.this,DGTL_TELE_MNG.class);
        startActivity(jump30);
    }
    public void nano(View v){
        Intent jump31 = new Intent(ELECTIVE.this,NANO_TECH.class);
        startActivity(jump31);
    }
    public void f_opt_net(View v){
        Intent jump32 = new Intent(ELECTIVE.this,F_OPTCS_NET_TECH.class);
        startActivity(jump32);
    }
    public void m_compute(View v){
        Intent jump33 = new Intent(ELECTIVE.this,MOB_COMPUTE.class);
        startActivity(jump33);
    }
    public void visual_p(View v){
        Intent jump34 = new Intent(ELECTIVE.this,VISUAL_P.class);
        startActivity(jump34);
    }
    public void intrus_dtc(View v){
        Intent jump35 = new Intent(ELECTIVE.this,INTRUS_DETECT.class);
        startActivity(jump35);
    }
    public void xml_web(View v){
        Intent jump36 = new Intent(ELECTIVE.this,XML_WEB.class);
        startActivity(jump36);
    }
    public void mul_tech(View v){
        Intent jump37 = new Intent(ELECTIVE.this,MUL_TECH.class);
        startActivity(jump37);
    }
    public void cadm(View v){
        Intent jump38 = new Intent(ELECTIVE.this,C_ADDED_DGN_M.class);
        startActivity(jump38);
    }
    public void intra(View v){
        Intent jump39 = new Intent(ELECTIVE.this,INTER_INTRA.class);
        startActivity(jump39);
    }
    public void m_control(View v){
        Intent jump40 = new Intent(ELECTIVE.this,MICROCONTROLLER.class);
        startActivity(jump40);
    }
    public void dsp(View v){
        Intent jump41 = new Intent(ELECTIVE.this,D_SIG_PRO.class);
        startActivity(jump41);
    }


}
