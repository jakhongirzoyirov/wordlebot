package org.example.wordlebot.utils;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyReplyMarkup {

    /*public ReplyKeyboard createReplyKeyboardMarkup(List<String> category) {
        ReplyKeyboardMarkup replyKeyboard = new ReplyKeyboardMarkup();

        KeyboardRow row = new KeyboardRow();
        List<KeyboardRow> rows = new ArrayList<>();
        for (int i = 1; i <= category.size(); i++) {
            row.add(new KeyboardButton(category.get(i - 1)));
            if (i % 2 == 0) {
                rows.add(row);
                row = new KeyboardRow();
            }
        }

        if (category.size() % 2 != 0) {
            rows.add(row);
        }
        replyKeyboard.setKeyboard(rows);
        replyKeyboard.setResizeKeyboard(true);
        return replyKeyboard;
    }

    public InlineKeyboardMarkup createInlineKeyboardMarkup(List<Answer> answers) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        Character variant = 'A';
        for (int i = 0; i < answers.size(); i++) {
            InlineKeyboardButton button = new InlineKeyboardButton(variant.toString());
            variant++;
            button.setCallbackData(answers.get(i).getId());

            row.add(button);
            if (i % 2 != 0) {
                rows.add(row);
                row = new ArrayList<>();
            }
        }

        if (answers.size() % 2 != 0) {
            rows.add(row);
        }
        inlineKeyboardMarkup.setKeyboard(rows);
        return inlineKeyboardMarkup;
    }

    public ReplyKeyboard createInlineKeyboardMarkupWithUrl() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();

        btn1.setCallbackData("back");
        btn1.setUrl("https://t.me/+8f_X5_CeMe1kZmVi");
        btn1.setText("ORTGA QAYTISH");

        row.add(btn1);
        rows.add(row);

        inlineKeyboardMarkup.setKeyboard(rows);
        return inlineKeyboardMarkup;
    }

    public ReplyKeyboard shareContact(String title) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setRequestContact(true);
        keyboardButton.setText(title);
        row.add(keyboardButton);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(row);

        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);
        return replyKeyboardMarkup;
    }*/

    /*public ReplyKeyboard crateInlineCallbackData(String id) {
        System.out.println("id = " + id);
        return createInlineKeyboardMarkup(categoryService.getVacancyByParentId(id));
    }*/
}
