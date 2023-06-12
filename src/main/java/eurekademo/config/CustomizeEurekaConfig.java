//package eurekademo.config;
//
//import java.security.KeyManagementException;
//import java.security.NoSuchAlgorithmException;
//import java.security.SecureRandom;
//import java.security.cert.CertificateException;
//import java.security.cert.X509Certificate;
//
//import javax.net.ssl.HostnameVerifier;
//import javax.net.ssl.SSLContext;
//import javax.net.ssl.SSLSession;
//import javax.net.ssl.X509TrustManager;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.netflix.discovery.AbstractDiscoveryClientOptionalArgs;
//import com.netflix.discovery.Jersey3DiscoveryClientOptionalArgs;
//
//@Configuration
//public class CustomizeEurekaConfig {
//
//    @Bean
//    @ConditionalOnMissingBean(AbstractDiscoveryClientOptionalArgs.class)
//    public Jersey3DiscoveryClientOptionalArgs jersey3DiscoveryClientOptionalArgs()
//        throws KeyManagementException, NoSuchAlgorithmException {
//        Jersey3DiscoveryClientOptionalArgs optionalArgs = new Jersey3DiscoveryClientOptionalArgs();
//        SSLContext context = SSLContext.getInstance("TLS");
//        context.init(null, new X509TrustManager[] {new X509TrustManager() {
//            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
//
//            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
//
//            public X509Certificate[] getAcceptedIssuers() {
//                return new X509Certificate[0];
//            }
//        }}, new SecureRandom());
//        optionalArgs.setSSLContext(context);
//        optionalArgs.setHostnameVerifier(new HostnameVerifier() {
//            @Override
//            public boolean verify(String hostname, SSLSession session) {
//                return true;
//            }
//        });
//        return optionalArgs;
//    }
//
//}
