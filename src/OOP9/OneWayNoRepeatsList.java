package OOP9;

public class OneWayNoRepeatsList {
    public static int DEFAULT_SIZE = 50;

    private int countOfEntries; //can be less than entry.length.
    private String[] entry;

    /**
     * creates an empty list with a given capacity.
     *
     * @param maximumNumberOfEntries
     */
    public OneWayNoRepeatsList(int maximumNumberOfEntries) {
        entry = new String[maximumNumberOfEntries];
        countOfEntries = 0;
    }

    /**
     * creates an empty list with a capacity of DEFAULT_SIZE
     */
    public OneWayNoRepeatsList() {
        entry = new String[DEFAULT_SIZE];
        countOfEntries = 0;
        //extra 설명
        /*
            this(DEFAULT_SIZE);
를 대신써도 가능하다.
         */

    }

    public int getMaximumNumberOfEntries() {//리스트의 용량을 나타내는 메서드
        return entry.length;
    }

    public int getNumberOfEntries() {
        return countOfEntries;
    }

    public boolean isFull() {
        return entry.length == countOfEntries;
        //return countOfEntries == entry.length;
    }

    public boolean isEmpty() {
        return entry.length == 0;
    }

    public boolean isOnList(String item) {
        for (int i = 0; i < countOfEntries; i++) {
            if (item.equalsIgnoreCase(entry[i]))
                return true;
        }
        return false;

    }

    public void addItem(String item) {
        if (isOnList(item)) {//이미 리스트에 있으면면
            System.out.println("The item is already on the list!");
        } else if (isFull()) {//리스트가 꽉찼으면
            System.out.println("Adding to a full list!");
            System.exit(0);
        } else {
            entry[countOfEntries] = item;
            countOfEntries++;
        }

    }

    public String getEntryAt(int position) {
        String result = null;
        if ((0 <= position) && (position < countOfEntries)) {
            result = entry[position];
        }
        return result;

    }
    public void eraseList(){//remove value of the lists
        //clear the list
        countOfEntries = 0;
    }
    public boolean atLastEntry(int position){
        return position == countOfEntries;
    }
}