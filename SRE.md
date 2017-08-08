![](http://i.imgur.com/XFAzEuc.png)

## DevOps Challenge
At tajawal, we believe that before writing code we have to first understand the problem. Because of this
we look for thinkers and problem solvers rather than “code monkeys”. If you are willing to
embark on an adventure where thinking comes before typing, then this role could be ideal for
you.

## Terraform:
### Task 01 :
 - Create terraform to setup the following
    - Create a VPC Using NAT 
    - Setup 3 instance in Different AZ & DIfferent Region with 1 ELB (2 server in Ireland & 1 in Singapore)
    - Bastion host with cloudwatch and Email notification (SNS )
    - Route 53 with healthcheck  
    
## Ansible: 
### Task 01 :
 - Setup Anisble playbook to deploy Jenkins Docker on Bastion server which you have created usign Terraform
 - Ansible should send a slack message on successfull/unsuccessfull deployment 
 
## CI && CD:
### Task 01 :
 - Build a small docker container for Jenkins using Dockerfile and Docker Compose with self sign ssl 
 
### Task 02 : 
 - Create an docker image based on ubuntu 16.04 for PHP/NGINX App and add following tools: 
    - PHP 
    - curl , git , vim, ping , pip , python,  
    - SSH / mount an RSA key for ubuntu user. 
    - add www-data user
    - allow www-data to connect via ssh
    
## Monitoring: 
### Task 01 : 
    - Create 3 Kibana dashboard must be used to monitor important metrics for PHP / NGINX app.
    
## Scripting: 
### Task 01 : 
Given a CSV file where each row contains the name of a city and its state separated by a
comma, your task is to replace the newlines in the file with semicolons as demonstrated in the
sample.

- Input Format
```
Casablanca, Grand Casablanca.
Dubai, Dubai.
Anchorage, Alaska
Asheville, N.C.
Atlanta, Ga.
Atlantic City, N.J.
```

- Output Format

```
Casablanca, Grand Casablanca.;Dubai, Dubai.;Anchorage, Alaska;Asheville, N.C.;Atlanta, Ga.;Atlantic City,
N.J.
```


### Task 02: 

Create a PHP Class [or Other scripting languages] to check the Status of URL [www.test-api-tajawal.com]

- if Code Response is 200 
print OK_STATUS message with replacemnet of placeholder
- if Code Response is 302
print REDIRECTION_STATUS message with replacemnet of placeholder
- Else
print ERROR_STATUS message with replacemnet of placeholder 

use same script to parse a given templates and replace Code placehoder in those Strings: 
```
const OK_STATUS = "Nice! The Code is {{ CODE_200 }}"
const REDIRECTION_STATUS = "Redirection! The Code is {{ CODE_302 }}"
const ERROR_STATUS = "Error occued the code is {{ CODE_ERROR }}"
```
## Checklist

Before submitting, make sure that your program

- [ ] Usage is clearly mentioned in the README file

## Note

Implementations focusing on **quality over feature completeness** will be highly appreciated,  don’t feel compelled to implement everything and even if you are not able to complete the challenge, please do submit it anyways.
