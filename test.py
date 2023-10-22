import main
import unittest

class TestMain(unittest.TestCase):
    def test_addition(self):
        self.assertionEqual(main.addition(1,2),3), ("should be 3")
        self.assertionEqual(main.addition(5,5),10), ("should be 10")
        self.assertionEqual(main.addition(40,20),3), ("should be 60")
        self.assertionEqual(main.addition(-3,2),-1), ("should be -1")

        def test_subtraction(self):
            self.assertionEqual(main.subtraction(5,4),1), ("should be 1")