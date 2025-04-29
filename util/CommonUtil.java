//package com.estore.util;
//
//import java.io.UnsupportedEncodingException;
//import java.security.Principal;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Component;
//
//import com.estore.model.ProductOrder;
//import com.estore.model.UserDtls;
//import com.estore.service.UserService;
//
//import jakarta.mail.MessagingException;
//import jakarta.mail.internet.MimeMessage;
//import jakarta.servlet.http.HttpServletRequest;
//
//@Component
//public class CommonUtil {
//
//    @Autowired
//    private JavaMailSender mailSender;
//
//    @Autowired
//    private UserService userService;
//
//    public Boolean sendMail(String url, String recipientEmail) {
//        try {
//            if (mailSender == null) {
//                throw new IllegalStateException("JavaMailSender bean is not initialized.");
//            }
//
//            MimeMessage message = mailSender.createMimeMessage();
//            MimeMessageHelper helper = new MimeMessageHelper(message);
//
//            helper.setFrom("electronicstore@gmail.com", "Shopping Cart");
//            helper.setTo(recipientEmail);
//
//            String content = "<p>Hello,</p>"
//                    + "<p>You have requested to reset your password.</p>"
//                    + "<p>Click the link below to change your password:</p>"
//                    + "<p><a href=\"" + url + "\">Change my password</a></p>";
//
//            helper.setSubject("Password Reset");
//            helper.setText(content, true);
//            mailSender.send(message);
//
//            return true;
//        } catch (MessagingException | UnsupportedEncodingException e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    public static String generateUrl(HttpServletRequest request) {
//        if (request == null) {
//            throw new IllegalArgumentException("Request object cannot be null.");
//        }
//        return request.getRequestURL().toString().replace(request.getServletPath(), "");
//    }
//
//    public Boolean sendMailForProductOrder(ProductOrder order, String status) {
//        try {
//            if (mailSender == null) {
//                throw new IllegalStateException("JavaMailSender bean is not initialized.");
//            }
//            if (order == null || order.getOrderAddress() == null || order.getProduct() == null) {
//                throw new IllegalArgumentException("Order or Order Details cannot be null.");
//            }
//
//            String msg = "<p>Hello [[name]],</p>"
//                    + "<p>Thank you for your order. Your order status: <b>[[orderStatus]]</b>.</p>"
//                    + "<p><b>Product Details:</b></p>"
//                    + "<p>Name: [[productName]]</p>"
//                    + "<p>Category: [[category]]</p>"
//                    + "<p>Quantity: [[quantity]]</p>"
//                    + "<p>Price: [[price]]</p>"
//                    + "<p>Payment Type: [[paymentType]]</p>";
//
//            MimeMessage message = mailSender.createMimeMessage();
//            MimeMessageHelper helper = new MimeMessageHelper(message);
//
//            helper.setFrom("daspabitra55@gmail.com", "Shopping Cart");
//            helper.setTo(order.getOrderAddress().getEmail());
//
//            msg = msg.replace("[[name]]", order.getOrderAddress().getFirstName());
//            msg = msg.replace("[[orderStatus]]", status);
//            msg = msg.replace("[[productName]]", order.getProduct().getTitle());
//            //msg = msg.replace("[[category]]", order.getProduct().getCategory());
//            msg = msg.replace("[[quantity]]", String.valueOf(order.getQuantity()));
//            msg = msg.replace("[[price]]", String.valueOf(order.getPrice()));
//            msg = msg.replace("[[paymentType]]", order.getPaymentType());
//
//            helper.setSubject("Product Order Status");
//            helper.setText(msg, true);
//            mailSender.send(message);
//
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    public UserDtls getLoggedInUserDetails(Principal p) {
//        if (p == null) {
//            throw new IllegalArgumentException("Principal cannot be null.");
//        }
//        return userService.getUserByEmail(p.getName());
//    }
//}

package com.estore.util;

import java.io.UnsupportedEncodingException;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.estore.model.ProductOrder;
import com.estore.model.UserDtls;
import com.estore.service.UserService;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class CommonUtil {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private UserService userService;

    public Boolean sendMail(String url, String recipientEmail) {
        try {
            if (mailSender == null) {
                throw new IllegalStateException("JavaMailSender bean is not initialized.");
            }

            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);

            helper.setFrom("electronicstore@gmail.com", "Shopping Cart");
            helper.setTo(recipientEmail);

            String content = "<p>Hello,</p>"
                    + "<p>You have requested to reset your password.</p>"
                    + "<p>Click the link below to change your password:</p>"
                    + "<p><a href=\"" + url + "\">Change my password</a></p>";

            helper.setSubject("Password Reset");
            helper.setText(content, true);
            mailSender.send(message);

            return true;
        } catch (MessagingException | UnsupportedEncodingException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String generateUrl(HttpServletRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("Request object cannot be null.");
        }
        return request.getRequestURL().toString().replace(request.getServletPath(), "");
    }

    public Boolean sendMailForProductOrder(ProductOrder order, String status) {
        try {
            if (mailSender == null) {
                throw new IllegalStateException("JavaMailSender bean is not initialized.");
            }
            if (order == null || order.getOrderAddress() == null || order.getProduct() == null) {
                throw new IllegalArgumentException("Order or Order Details cannot be null.");
            }

            String msg = "<p>Hello [[name]],</p>"
                    + "<p>Thank you for your order. Your order status: <b>[[orderStatus]]</b>.</p>"
                    + "<p><b>Product Details:</b></p>"
                    + "<p>Name: [[productName]]</p>"
                    + "<p>Category: [[category]]</p>"
                    + "<p>Quantity: [[quantity]]</p>"
                    + "<p>Price: [[price]]</p>"
                    + "<p>Payment Type: [[paymentType]]</p>";

            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);

            helper.setFrom("daspabitra55@gmail.com", "Shopping Cart");
            helper.setTo(order.getOrderAddress().getEmail());

            msg = msg.replace("[[name]]", order.getOrderAddress().getFirstName());
            msg = msg.replace("[[orderStatus]]", status);
            msg = msg.replace("[[productName]]", order.getProduct().getTitle());
            msg = msg.replace("[[category]]", order.getProduct().getCategory());
            msg = msg.replace("[[quantity]]", String.valueOf(order.getQuantity()));
            msg = msg.replace("[[price]]", String.valueOf(order.getPrice()));
            msg = msg.replace("[[paymentType]]", order.getPaymentType());

            helper.setSubject("Product Order Status");
            helper.setText(msg, true);
            mailSender.send(message);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public UserDtls getLoggedInUserDetails(Principal p) {
        if (p == null) {
            throw new IllegalArgumentException("Principal cannot be null.");
        }
        return userService.getUserByEmail(p.getName());
    }
}

