package io.github.wechaty.schemas

enum class MessageType(// Video(4), Video(43)
    var code: Int
) {
    Unknown(0),
    Attachment(1),  // Attach(6),
    Audio(2),  // Audio(1), Voice(34)
    Contact(3),  // ShareCard(42)
    ChatHistory(4),  // ChatHistory(19)
    Emoticon(5),  // Sticker: Emoticon(15), Emoticon(47)
    Image(6),  // Img(2), Image(3)
    Text(7),  // Text(1)
    Location(8),  // Location(48)
    MiniProgram(9),  // MiniProgram(33)
    Transfer(10),  // Transfers(2000)
    RedEnvelope(11),  // RedEnvelopes(2001)
    Recalled(12),  // Recalled(10002)
    Url(13),  // Url(5)
    Video(14);

    companion object {
        fun getByCode(code: Int): MessageType {
            val values = values()
            for (value in values) {
                if (value.code == code) {
                    return value
                }
            }
            return MessageType.Unknown
        }
    }

}

data class MessagePayload(val id:String) {
    var mentionIdList: List<String>? = null
    var filename : String?= null;
    var text: String? = null
    var timestamp: Long? = null
    var type: MessageType? = null
    var fromId: String? = null
    var roomId: String? = null
    var toId: String? = null
}

class MessageQueryFilter {
    private val fromId: String? = null
    private val id: String? = null
    private val roomId: String? = null
    private val text: String? = null
    private val toId: String? = null
    private val type: MessageType? = null
}