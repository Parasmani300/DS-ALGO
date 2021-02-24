from abc import ABC, abstractmethod
class Shape(ABC):
    @abstractmethod
    def area(self):
        pass
    @abstractmethod
    def perimeter(self):
        pass

with open('sample.txt', 'w') as fp:

    content = fp.read()

import sqlite3
try:
    dbConnection = sqlite3.connect('TEST.db')
    cursor = dbConnection.cursor()
    '''
    Few db operations
    ...
    '''
except Exception:
    print('No Connection.')
finally:
    dbConnection.close()




# context manager
import sqlite3
class DbConnect(object):
    def __init__(self, dbname):
        self.dbname = dbname
    def __enter__(self):
        self.dbConnection = sqlite3.connect(self.dbname)
        return self.dbConnection
    def __exit__(self, exc_type, exc_val, exc_tb):
        self.dbConnection.close()
with DbConnect('TEST.db') as db:
    cursor = db.cursor()
    '''
   Few db operations
   ...
    '''


# Coroutines
def TokenIssuer():
    tokenId = 0
    while True:
        name = yield
        tokenId += 1
        print('Token number of', name, ':', tokenId)
t = TokenIssuer()
next(t)
t.send('George')
t.send('Rosy')
t.send('Smith')


def TokenIssuer(tokenId=0):
    try:
       while True:
            name = yield
            tokenId += 1
            print('Token number of', name, ':', tokenId)
    except GeneratorExit:
        print('Last issued Token is :', tokenId)
t = TokenIssuer(100)
next(t)
t.send('George')
t.send('Rosy')
t.send('Smith')
t.close()

def coroutine_decorator(func):
    def wrapper(*args, **kwdargs):
        c = func(*args, **kwdargs)
        next(c)
        return c
    return wrapper

@coroutine_decorator
def TokenIssuer(tokenId=0):
    try:
        while True:
            name = yield
            tokenId += 1
            print('Token number of', name, ':', tokenId)
    except GeneratorExit:
        print('Last issued Token is :', tokenId)
t = TokenIssuer(100)
t.send('George')
t.send('Rosy')
t.send('Smith')
t.close()