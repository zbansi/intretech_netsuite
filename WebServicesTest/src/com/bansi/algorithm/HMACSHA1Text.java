using System.Security.Cryptography;

/// <summary>
/// HMACSHA1�㷨���ܲ�����ToBase64String
/// </summary>
/// <param name="strText">ǩ�������ַ���</param>
/// <param name="strKey">��Կ����</param>
/// <returns>����һ��ǩ��ֵ(����ϣֵ)</returns>
public static string ToBase64hmac(string strText, string strKey)
{
    HMACSHA1 myHMACSHA1 = new HMACSHA1(Encoding.UTF8.GetBytes(strKey));
    byte[] byteText = myHMACSHA1.ComputeHash(Encoding.UTF8.GetBytes(strText));
    return System.Convert.ToBase64String(byteText);
}

public static string HMACSHA1Text(string EncryptText, string EncryptKey)
{
    //HMACSHA1����
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