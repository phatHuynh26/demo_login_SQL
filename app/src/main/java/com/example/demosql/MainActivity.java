package com.example.demosql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/phpmyadmin/index.php", "root", "");

            // Truy vấn dữ liệu
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user");

            // Xử lý kết quả truy vấn
            while (resultSet.next()) {

                String name = resultSet.getString("ten_dang_nhap");
                String pass = resultSet.getString("mat_khau");

                // In ra kết quả
                System.out.println(name + " - " + pass );

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}