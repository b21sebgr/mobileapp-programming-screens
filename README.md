# Rapport

//TODO
Fixa bilder

I added a button and a edittext in main, took the text from the edittext and put it in the intent
and started the second activity when the button is clicked. Then i made the second activity and
made it use the string inputed by the other activity to output in a textview.

```
change.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("input", input.getText());
        startActivity(intent);
    }
});
```

Bilder läggs i samma mapp som markdown-filen.

![](bild.png)