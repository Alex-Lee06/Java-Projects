'''
Created on Apr 19, 2017

@author: Alex Lee
'''
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from pprint import pprint

file_object = 'TennisPlayers.txt'
name = []
driver = webdriver.Chrome()
driver.implicitly_wait(20) # seconds
with open(file_object, 'r') as fileobject:
    line = fileobject.readlines()
for num, line in enumerate(line, 1):
    driver.get(line)
    name.append(driver.find_element_by_xpath('//*[@id="PlayerDiv"]/div[1]/div/div[2]/ul/li[1]/strong'))

print(name)

#         driver.get(url)



#     for line in file_object:
#         url.append(line)
#         pprint('Url is: ' + url)


# 
# 
# 

# DOB = driver.find_element_by_xpath('//*[@id="liDOB"]/strong')
# style = driver.find_element_by_xpath('//*[@id="PlayerDiv"]/div[1]/div/div[2]/ul/li[5]/strong')
# 
#  
# 
# 
# print('done')
# content_Name = name.text
# content_DOB = DOB.text
# content_Style = style.text
# 
# content = []
# 
# for i in range(3): content.append(content_Name, content_DOB, content_Style)
# for i in range(3): print(i)

# content.append()
# 
# content_text = content_name.text

# print('content_text: ' + content_text)
# for i 
#     print ('content: ' + i.get_attribute('strong'))
# dig_content = content.fin
