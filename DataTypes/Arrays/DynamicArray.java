package ua.com.alevel.dynamicArray;

// HELPER about Dynamic Array - https://www.javatpoint.com/dynamic-array-in-java

import ua.com.alevel.entity.User;

public class DynamicArray<T extends User> {

    private User[] usersArray;
    private final int INITIAL_ARRAY_CAPACITY = 20;
    private int count;
    private int arrayLength;

    public DynamicArray() {
        usersArray = new User[INITIAL_ARRAY_CAPACITY];
        count = 0;
        arrayLength = 1;
    }

    public int getArrayLength() {
        return arrayLength;
    }

    public void add(User user) {
        if (count == arrayLength) {
            growArraySize();
        }
        usersArray[count] = user;
        count++;
    }

    public void delete(String id) {
        int index = getIndex(id);
        if (index == -1) {
            return;
        }
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                usersArray[index] = usersArray[index + 1];
            }
            usersArray[count - 1] = null; // how to delete user ???
            count--;
        }
    }

    private void growArraySize() {
        User[] tempUserArray;
        if (count == arrayLength) {
            tempUserArray = new User[arrayLength * 2];
            if (arrayLength >= 0) System.arraycopy(usersArray, 0, tempUserArray, 0, arrayLength);
            usersArray = tempUserArray;
            arrayLength = arrayLength * 2;
        }
    }

    private void shrinkArraySize() {
        User[] tempUserArray;
        if (count > 0) {
            tempUserArray = new User[count];
            System.arraycopy(usersArray, 0, tempUserArray, 0, count);
            arrayLength = count;
            usersArray = tempUserArray;
        }
    }

    private int getIndex(String id) {
        int index;
        for (index = 0; index < usersArray.length; index++) {
            if (usersArray[index].getId().equals(id)) {
                return index;
            }
        }
        System.out.println("user's id isn't found");
        return -1; // what to return if index not found ???
    }

    public T getId(String id) {
        for (User user : usersArray) {
            if (user.getId().equals(id)) {
                return (T) user;
            }
        }
        return null;
    }

    public boolean isContainsId(String id) {
        for (User user : usersArray) {
            if (user == null) {
                continue;
            }
            if (user.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return usersArray.length < 1;
    }

    private void deleteNull(User[] users) {
        for (User user : usersArray) {
            if (users.length <= 1) {
                return;
            }
            if (user == null) {
                shrinkArraySize();
                deleteNull(usersArray);
            }
        }
    }

    @Override
    public String toString() {
        deleteNull(usersArray);
        StringBuilder stringBuilder = new StringBuilder();
        for (User user : usersArray) {
            stringBuilder.append(user);

        }
        return stringBuilder.toString();
    }
}
