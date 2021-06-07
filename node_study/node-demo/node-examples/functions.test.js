const functions = require('./functions')

test('2 plus 2 is 4', () => {
    expect(functions.add(2, 2)).not.toBe(5);
})