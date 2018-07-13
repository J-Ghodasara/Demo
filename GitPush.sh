#!/bin/bash
git init
git add *
git commit -m "Auto generated Commit"
git config --global user.email "jay.ghodasara.sa@gmail.com"
git config --global user.name "J-Ghodasara"
git remote add origin $1
git push --force origin master


















