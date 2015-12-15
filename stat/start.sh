#!/bin/bash

java Bootstrap | $1/bin/telegram-cli -k $1/tg-server.pub -C | java Stat

