import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class tugas extends JFrame {
    private JTextField fNamaBarang;
    private JTextField fHarga;
    private  JButton submitbutton;
    private JButton CLEARButton;
    private JPanel mainPanel;
    private JTextArea tacariproduk;

    public tugas(){
        setContentPane(mainPanel);
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible (true);

    }
    public static void main(String[] args) throws IOException {
        tugas mytugas = new tugas();
        ConnectURI mykoneksi = new ConnectURI();
        URL myAddress = ConnectURI.buildURL
                ("https://farmasi.mimoapps.xyz/mimoqss2auyqD1EAlkgZCOhiffSsFl6QqAEIGtM");

        //respon
        String response = ConnectURI.getresponsefromhttpUrl(myAddress);
        System.out.println(response);
        //decoding json
        assert response != null;
        JSONArray responseJSON = new JSONArray (response);
        ArrayList<FarmasiData> models = new ArrayList<>();


        for (int i=0;i< responseJSON.length();i++) {
            FarmasiData farData = new FarmasiData();
            JSONObject myJSONObject = responseJSON.getJSONObject(i);
            farData.setI_name(myJSONObject.getString("i_name"));
            farData.setI_qty(myJSONObject.getString("i_qty"));
            farData.setI_sell(myJSONObject.getString("i_sell"));
            models.add(farData);
        }

        mytugas.submitbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int index = 0; index < models.size(); index++) {
                    int harga = Integer.parseInt(models.get(index).getI_sell());
                    String nama = String.valueOf(models.get(index).getI_name());
                    String stok = models.get(index).getI_qty();
                    if (nama.charAt(0)=='S' && harga < 7000 && stok !=null) {
                        mytugas.tacariproduk.append("Nama Barang : " + nama + "\n Harga : " + harga +
                                "\n Stok : "+ stok + "\n");
                    }
                }
            }
        });

    }
}