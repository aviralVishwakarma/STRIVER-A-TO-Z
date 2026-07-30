class Solution {
    List<String> list = new ArrayList<>();

    public List<String> addOperators(String num, int target) {
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(0) == '0' && i > 0) {
                break;
            }
            String first = num.substring(0, i + 1);
            long number = Long.parseLong(first);
            dfs(i + 1, first, number, number, num, target);
        }
        return list;
    }

    public void dfs(int index, String expression, long prev, long value, String num, int target) {
        if (index == num.length()) {
            if (value == target) {
                list.add(expression);
            }
            return;
        }
        for (int i = index; i < num.length(); i++) {
            if (i > index && num.charAt(index) == '0') {
                break;
            }
            String currentString = num.substring(index, i + 1);
            long current = Long.parseLong(currentString);

            dfs(i + 1, expression + '+' + currentString, current, value + current, num, target);

            dfs(i + 1, expression + '-' + currentString, -current, value - current, num, target);

            dfs(i + 1, expression + '*' + currentString, current * prev, value - prev + prev * current, num, target);
        }
    }

}