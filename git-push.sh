#!/bin/bash  
  
commit_message=$1

git add .
git commit -am "$commit_message"
git push origin main

clear
figlet "Done!"
sleep 5
clear
