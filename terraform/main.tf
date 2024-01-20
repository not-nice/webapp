
provider "aws" {
  region = "us-east-1"  # Change this to your desired AWS region
}

resource "aws_s3_bucket" "my_bucket" {
  bucket = "s3bucket-92"  # Change this to a unique bucket name
  acl    = "private"
}

resource "aws_instance" "example_instance" {
  ami           = "ami-0c7217cdde317cfec"
  instance_type = "t2.micro"
}
