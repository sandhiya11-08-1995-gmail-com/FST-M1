user_A = input("Enter player A name: ")
user_B = input("Enter player B name: ")

user_A_input = input("Select your choice: ").lower()
user_B_input = input("Select your choice: ").lower()

if user_A_input == user_B_input:
    print("It's a tie!")
elif user_A_input == 'rock':
    if user_B_input == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif user_A_input == 'scissors':
    if user_B_input == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif user_A_input == 'paper':
    if user_B_input == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")
