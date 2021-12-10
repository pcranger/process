#!/bin/sh
cd C:/Users/tmhieu1/Desktop/process

git add --all
timestamp() {
  date +"at %H:%M:%S on %d/%m/%Y"
}
git commit -am "Regular auto-commit $(timestamp)"
git push origin main