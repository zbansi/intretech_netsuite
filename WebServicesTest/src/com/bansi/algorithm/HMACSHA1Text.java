using System.Security.Cryptography;

/// <summary>
/// HMACSHA1算法加密并返回ToBase64String
/// </summary>
/// <param name="strText">签名参数字符串</param>
/// <param name="strKey">密钥参数</param>
/// <returns>返回一个签名值(即哈希值)</returns>
public static string ToBase64hmac(string strText, string strKey)
{
    HMACSHA1 myHMACSHA1 = new HMACSHA1(Encoding.UTF8.GetBytes(strKey));
    byte[] byteText = myHMACSHA1.ComputeHash(Encoding.UTF8.GetBytes(strText));
    return System.Convert.ToBase64String(byteText);
}

public static string HMACSHA1Text(string EncryptText, string EncryptKey)
{
    //HMACSHA1加密
    string message;
    string key;
    message = EncryptText;
    key = EncryptKey;

    System.Text.ASCIIEncoding encoding = new System.Text.ASCIIEncoding();
    byte[] keyByte = encoding.GetBytes(key);
    HMACSHA1 hmacsha1 = new HMACSHA1(keyByte);
    byte[] messageBytes = encoding.GetBytes(message);
    byte[] hashmessage = hmacsha1.ComputeHash(messageBytes);

    return ByteToString(hashmessage);
}