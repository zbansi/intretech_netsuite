const
crypto = require('crypto');

function hashfunctionsha1(base_string, key) {
	return crypto.createHmac('sha1', key).update(base_string).digest('base64');
}

const
oauth = OAuth({
	consumer : {
		key : '<your consumer key>',
		secret : '<your consumer secret>'
	},
	signature_method : 'HMAC-SHA1',
	hashfunction : hashfunction_sha1
});
