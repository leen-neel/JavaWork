#!/bin/bash  
  
echo "Enter the commit message: "
read commit_message

git add .
git commit -am "$commit_message"
git push origin main

sleep 2
echo "DONE!!!"
sleep 2
clear
