package lecture8.poker;


public class Poker {

	public static void sortCards(Card[] cards) {
		int position;
		int maxValue;
		for (int i = 0; i < 5; i++) {
			position = i;
			maxValue = cards[position].getValue();
			for (int j = i + 1; j < 5; j++) {
				if (maxValue < cards[j].getValue()) {
					position = j;
					maxValue = cards[j].getValue();
				}
			}
			Card temp = cards[i];
			cards[i] = cards[position];
			cards[position] = temp;
		}
	}
	
	public static String testCards(Card[] cards) {
		sortCards(cards);
		String cardValue = "";
		if (sameColor(cards)) {
			// highest card ace
			if (isStreet(cards)) {
				if (cards[0].getValue() == 14) {
					cardValue = "Royal Flush in the color "
							+ cards[0].getColorText();
				} else {
					cardValue = "Straight Flush in the color "
							+ cards[0].getColorText();
				}
			} else {
				cardValue = "Flush in the color " + cards[1].getColorText();
			}
		}
		/* Quads */
		else if (((cards[1].getValue() == cards[2].getValue()) && (cards[2]
				.getValue() == cards[3].getValue()))
				&& ((cards[0].getValue() == cards[1].getValue()) || (cards[1]
						.getValue() == cards[2].getValue()))) {
			cardValue = "Four Of A Kind (Quads.)";
		}
		/* Full House */
		else if (((cards[0].getValue() == cards[1].getValue())
				&& (cards[3].getValue() == cards[4].getValue()))
				&& ((cards[1].getValue() == cards[2].getValue())
					|| (cards[2].getValue() == cards[3].getValue()))) {
				cardValue = "Full House.";
		}
		/* Three of a Kind */
		else if (((cards[0].getValue() == cards[1].getValue()) && (cards[0]
				.getValue() == cards[2].getValue()))
				|| ((cards[1].getValue() == cards[2].getValue()) && (cards[2]
						.getValue() == cards[3].getValue()))
				|| ((cards[2].getValue() == cards[3].getValue()) && (cards[3]
						.getValue() == cards[4].getValue()))) {
			cardValue = "Three of a kind.";
		}
		/* Two Pairs */
		else if (
				((cards[0].getValue() == cards[1].getValue()) && (cards[2].getValue() == cards[3].getValue()))
				|| ((cards[0].getValue() == cards[1].getValue()) && (cards[3].getValue() == cards[4].getValue()))
				|| ((cards[1].getValue() == cards[2].getValue()) && (cards[3].getValue() == cards[4].getValue()))
				) {
			cardValue = "Two Pairs";
		}
		/* One Pair */
		else if ((cards[0].getValue() == cards[1].getValue())
				|| (cards[1].getValue() == cards[2].getValue())
				|| (cards[2].getValue() == cards[3].getValue())
				|| (cards[3].getValue() == cards[4].getValue())) {
			cardValue = "One Pair.";
		} else {
			cardValue = "High Card: " + cards[0].getValueText();
		}
		return cardValue;
	}
	
	protected static boolean isStreet(Card[] cards) {
		return (cards[0].getValue() - 1 == cards[1].getValue())
				&& (cards[1].getValue() - 1 == cards[2].getValue())
				&& (cards[2].getValue() - 1 == cards[3].getValue())
				&& (cards[3].getValue() - 1 == cards[4].getValue());
	}

	protected static boolean sameColor(Card[] cards) {
		return ((cards[0].getColor() == cards[1].getColor())
				&& (cards[1].getColor() == cards[2].getColor())
				&& (cards[2].getColor() == cards[3].getColor()) && (cards[3]
				.getColor() == cards[4].getColor()));
	}
	
	
}
