package controllers;

import DAO.User;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.Animation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.util.Duration;
import tray.animations.AnimationType;
import tray.animations.FadeAnimation;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;
import utils.LoginFunc;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;


public class loginController implements Initializable {


    @FXML
    private JFXTextField idField;

    @FXML
    private JFXPasswordField pwdField;


    private User tempusr;
    private LoginFunc exam;
    @FXML
    void notification(ActionEvent event) {
        if (exam.isAccessible(getTempUsr())) {
            String title = "成功登陆";
            String message = "用户登陆名： " + "zerkvi";
            NotificationType notifyType = NotificationType.SUCCESS;
            TrayNotification tray = new TrayNotification();
            tray.setTitle(title);
            tray.setMessage(message);
            tray.setNotificationType(notifyType);
            tray.setAnimationType(AnimationType.FADE);
            tray.showAndDismiss(new Duration(3));
        }
        else{
            String title = "登陆失败";
            String message = "用户登陆名或密码错误";
            NotificationType notifyType = NotificationType.ERROR;
            TrayNotification tray = new TrayNotification();
            tray.setTitle(title);
            tray.setMessage(message);
            tray.setNotificationType(notifyType);
            tray.setAnimationType(AnimationType.FADE);
            tray.showAndDismiss(new Duration(3));
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
          tempusr=new User();
          exam=new LoginFunc();
    }

    public User getTempUsr(){
        tempusr.setUsername(idField.getText().toString());
        tempusr.setPassword(pwdField.getText().toString());
        return tempusr;
    }

}
