
WebApp: User Information Input
Overview:

This web application is a simple yet effective tool for capturing user information. Developed as a solo project, it enables users to input and submit their name, phone number, and address conveniently. The project leverages JavaScript for the front-end functionality and Maven as the build tool for project management.
Technologies Used:

    Frontend: JavaScript
    Build Tool: Maven
    Infrastructure as Code (IaC): Terraform
    Version Control: Git
    Continuous Integration/Continuous Deployment (CI/CD): GitHub Actions
    Code Analysis and Security Scanning: Github


AWS Resources:

The application utilizes various AWS services, including:

    Amazon RDS: For database management.
    Amazon S3 bucket:Storage and Backup:
    Amazon EC2: For scalable computing capacity.
    Internet Gateway: Providing internet connectivity.
    Virtual Private Cloud (VPC): Ensuring a secure network environment.
    Subnets: Including both public and private subnets.

Installation:

To deploy the AWS infrastructure using Terraform, follow these steps:

    Clone the repository:

    bash

git clone https://github.com/not-nice/webapp.git

Navigate to the Terraform directory:

bash

cd webapp/terraform

Run Terraform commands:

bash

    terraform init
    terraform apply

Testing:

Two testing phases have been implemented, each with at least one sample test. The tests ensure the functionality and reliability of the application.
CI/CD Pipelines:

Continuous Integration/Continuous Deployment (CI/CD) pipelines have been set up using GitHub Actions. This facilitates automated testing and deployment whenever changes are pushed to the repository.
Code Analysis and Security Scanning:

Statische Code-Analyse und Security Scanning wurden mithilfe von GitHub und SonarCloud durchgeführt.
Documentation:

Find detailed documentation and additional information in the GitHub Repository. This includes the project structure, Terraform scripts, and any additional setup instructions.
Note:

This project has been developed from scratch and does not reuse any code or resources from previous semester projects.

Feel free to explore, contribute, or provide feedback!
