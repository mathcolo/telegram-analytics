import csv
import sys
from datetime import datetime, timedelta
import matplotlib.pyplot as plt
import operator

rows = []

timesA = [0] * 24
timesB = [0] * 24

fiveAmEvents = []

people = {}

with open("data.txt", 'r') as csvfile:
	reader = csv.reader(csvfile, delimiter=',', quotechar='|')
	for row in reader:
		row[0] = datetime.strptime(row[0], '%Y-%m-%d %H:%M:%S') + timedelta(hours=2)
		rows.append(row)

		if row[0].hour == 4:
			fiveAmEvents.append(row)

		if row[1] == 'Person LastA':
			timesA[row[0].hour] += 1
		#elif row[1] == 'Person LastB':
		#	timesB[row[0].hour] += 1

		if row[1] in people:
			people[row[1]] += 1
			
		else:
			people[row[1]] = 1

	people = sorted(people.items(), key=operator.itemgetter(1))


for i in range(0,len(timesA)):
	plt.bar(i,timesA[i],color='r',align='center')

for i in range(0,len(timesB)):
	plt.bar(i,timesB[i],color='b',align='center')


##print(people)
#print(*fiveAmEvents, sep='\n')
plt.show()