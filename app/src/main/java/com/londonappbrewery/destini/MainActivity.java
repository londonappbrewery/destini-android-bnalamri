package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mIndex;
    int mButtonIndicator;

    String  mTextViewText;
    String  mButtonTopText;
    String  mButtonButtomText;

    private Story[] mStoryBank = new Story[] {
            new Story("Your car has blown a tire on a winding road in the middle of nowhere with no cell phone reception. You decide to hitchhike. A rusty pickup truck rumbles to a stop next to you. A man with a wide brimmed hat with soulless eyes opens the passenger door for you and asks: \\\"Need a ride, boy?\\","I\\'ll hop in. Thanks for the help!","Better ask him if he\\'s a murderer first."),
            new Story("He nods slowly, unphased by the question.","At least he\\'s honest. I\\'ll climb in.","Wait, I know how to change a tire."),
            new Story("As you begin to drive, the stranger starts talking about his relationship with his mother. He gets angrier and angrier by the minute. He asks you to open the glovebox. Inside you find a bloody knife, two severed fingers, and a cassette tape of Elton John. He reaches for the glove box.","I love Elton John! Hand him the cassette tape.","It\\'s him or me! You take the knife and stab him."),
            new Story("What? Such a cop out! Did you know traffic accidents are the second leading cause of accidental death for most adult age groups?","END","END"),
            new Story("As you smash through the guardrail and careen towards the jagged rocks below you reflect on the dubious wisdom of stabbing someone while they are driving a car you are in.","END","END"),
            new Story("You bond with the murderer while crooning verses of \"Can you feel the love tonight\". He drops you off at the next town. Before you go he asks you if you know any good places to dump bodies. You reply: \\\"Try the pier.\\","END","END")

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButtonIndicator = 1;
                setViewText(mButtonIndicator);
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButtonIndicator = 2;
                setViewText(mButtonIndicator);
            }
        });

    }

    private void updateViewText(int Index){
        mIndex = Index;
        mTextViewText = mStoryBank[mIndex].getStoryTextId();
        mTextView.setText(mTextViewText);

        mButtonTopText = mStoryBank[mIndex].getButtonTopTextId();
        mButtonTop.setText(mButtonTopText);

        mButtonButtomText = mStoryBank[mIndex].getButtonButtomTextId();
        mButtonBottom.setText(mButtonButtomText);
    }

    private void setViewText(int Indicator){
        if (Indicator == 1){
            switch (mIndex) {
                case 0:
                    updateViewText(2);
                    break;
                case 1:
                    updateViewText(2);
                    break;
                case 2:
                    updateViewText(5);
                    break;
                default:
                    finish();
                    break;
            }
        }
        if (Indicator==2){
            switch (mIndex) {
                case 0:
                    updateViewText(1);
                    break;
                case 1:
                    updateViewText(3);
                    break;
                case 2:
                    updateViewText(4);
                    break;
                default:
                    finish();
                    break;
            }
        }
        }
    }
