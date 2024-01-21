import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.ListBucketsResponse;
import software.amazon.awssdk.services.s3.model.Bucket;

public class AWSS3Example {

    public static void main(String[] args) {
        // Replace these credentials with your own
        String accessKeyId = "ASIARL7AWOA4WKGZMTEJ";
        String secretAccessKey = "Jpt7jSP2FrQubgiGwyhOKt44aXrwrIGjJGPfW++L";
        

        // Create AWS credentials
        AwsBasicCredentials awsCredentials = AwsBasicCredentials.create(accessKeyId, secretAccessKey);

        // Create an S3 client
        S3Client s3 = S3Client.builder()
                .region(Region.US_EAST_1) // Set your desired AWS region
                .credentialsProvider(StaticCredentialsProvider.create(awsCredentials))
                .build();

        // List all S3 buckets
        ListBucketsResponse bucketsResponse = s3.listBuckets();
        System.out.println("S3 Buckets:");

        for (Bucket bucket : bucketsResponse.buckets()) {
            System.out.println(bucket.name());
        }
    }
}

import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.ListBucketsResponse;
import software.amazon.awssdk.services.s3.model.S3Exception;
import software.amazon.awssdk.services.s3.model.Bucket;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Hello, Maven!");

        // AWS S3 integration example
        listS3Buckets();
    }

    public static void listS3Buckets() {
        // Replace these credentials with your own (not recommended in production)
        String accessKeyId = "ASIARL7AWOA4WKGZMTEJ";
        String secretAccessKey = "Jpt7jSP2FrQubgiGwyhOKt44aXrwrIGjJGPfW++L";

        // Create an S3 client
        S3Client s3 = S3Client.builder()
                .region(Region.US_EAST_1) // Set your desired AWS region
                .credentialsProvider(StaticCredentialsProvider.create(
                        AwsBasicCredentials.create(accessKeyId, secretAccessKey)))
                .build();

        try {
            // List all S3 buckets
            ListBucketsResponse bucketsResponse = s3.listBuckets();
            System.out.println("S3 Buckets:");

            for (Bucket bucket : bucketsResponse.buckets()) {
                System.out.println(bucket.name());
            }
        } catch (S3Exception e) {
            System.err.println(e.awsErrorDetails().errorMessage());
            System.exit(1);
        }
    }
}
