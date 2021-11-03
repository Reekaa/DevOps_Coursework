#!/bin/bash

validInput=15
nonIntegerInput=Bob

echo "Starting unit tests"
echo "------------------------------------------------------------------"
echo "When a valid number provided the result is: "
java Dec2Hex $validInput
echo
echo "When no input argument is provided, an error message is returned: "
java Dec2Hex
echo
echo "When non integer input is provided, an error message is returned: "
java Dec2Hex $nonIntegerInput
echo "------------------------------------------------------------------"
echo "End of testing"
echo
exit
